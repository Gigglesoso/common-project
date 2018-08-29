package lambda_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * @author Administrator
 * ��ʽapi��lumbda���ʽ����ʹ��
 */
public class LambdaPredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> predicateA = (n)->{return n>3;};//Lumbda���ʽ��������д����ǰ��Ĳ���Ϊ����������ʡ��С���ţ�ֻ��һ������ֵ����ʡ�Դ����ţ���predicateB
		Predicate<Integer> predicateB = n->n%2==0;//ż��
		List<Integer> list = Arrays.asList(1,3,5,7,9,10);
		filter(list,predicateA);//����3
		filter(list,predicateB);//ż��
		streamFilter(list,predicateA);//��ʽapiʹ�ô���3������
		muchFilter(list,predicateA,predicateB);//��ʽapiʹ�ô���3��������ż��������
	}
	/**
	 * @param list
	 * @param predicate
	 * ����ѭ��
	 */
	public static void filter(List<Integer> list,Predicate<Integer> predicate) {//�����Զ���predicate����Ϊʵ�ֶ�������ʵ�֡�
		for(Integer n:list) {
			if(predicate.test(n)) {
				System.out.println(n);
			}
		}
	}
	/**
	 * @param list
	 * @param predicate
	 * ʹ����ʽapi
	 * ���ˣ�ѭ����������˺�Ľ��
	 */
	public static void streamFilter(List<Integer> list,Predicate<Integer> predicate) {
		list.stream().filter((n)->(predicate.test(n))).forEach(n->System.out.println(n));
	}
	/**
	 * ʹ����ʽapiʵ�ֶ��predicate����,ͬʱ���,Predicate����ʹ��and(),or()�����ӣ�ʵ������
	 */
	public static void muchFilter(List<Integer> list,Predicate<Integer> a,Predicate<Integer> b) {
		list.stream().filter(a.and(b)).forEach(n->System.out.println(n));
	}
	
	 
}
