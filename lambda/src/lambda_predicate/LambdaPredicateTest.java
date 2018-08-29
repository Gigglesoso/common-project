package lambda_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * @author Administrator
 * 流式api和lumbda表达式联合使用
 */
public class LambdaPredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> predicateA = (n)->{return n>3;};//Lumbda表达式最完整的写法，前面的参数为单个，可以省略小括号，只有一个返回值可以省略大括号，见predicateB
		Predicate<Integer> predicateB = n->n%2==0;//偶数
		List<Integer> list = Arrays.asList(1,3,5,7,9,10);
		filter(list,predicateA);//大于3
		filter(list,predicateB);//偶数
		streamFilter(list,predicateA);//流式api使用大于3过滤器
		muchFilter(list,predicateA,predicateB);//流式api使用大于3过滤器和偶数过滤器
	}
	/**
	 * @param list
	 * @param predicate
	 * 正常循环
	 */
	public static void filter(List<Integer> list,Predicate<Integer> predicate) {//可以自定义predicate的行为实现多样化的实现。
		for(Integer n:list) {
			if(predicate.test(n)) {
				System.out.println(n);
			}
		}
	}
	/**
	 * @param list
	 * @param predicate
	 * 使用流式api
	 * 过滤，循环，输出过滤后的结果
	 */
	public static void streamFilter(List<Integer> list,Predicate<Integer> predicate) {
		list.stream().filter((n)->(predicate.test(n))).forEach(n->System.out.println(n));
	}
	/**
	 * 使用流式api实现多个predicate过滤,同时输出,Predicate可以使用and(),or()等连接，实现与或非
	 */
	public static void muchFilter(List<Integer> list,Predicate<Integer> a,Predicate<Integer> b) {
		list.stream().filter(a.and(b)).forEach(n->System.out.println(n));
	}
	
	 
}
