package List;

import java.util.Arrays;
import java.util.List;
/**
 * @author Administrator
 * 使用Lambda表达式循环List
 */
public class ListTest {
	public static void main(String[] args) {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		
		//before 1.8
			//for循环
		for (int i = 0; i < features.size(); i++) {
			System.out.println("for循环： "+features.get(i));
		}
			//增强for循环
		for(String feature:features) {
			System.out.println("增强for循环： "+feature);
		}
		
		//after 1.8
			// 1 lambda表达式
		features.forEach(n->System.out.println("Lambda表达式："+n));
			// 2 方法引用由::双冒号操作符标示  ?如何传参数？
		features.forEach(System.out::println);
	}
}
