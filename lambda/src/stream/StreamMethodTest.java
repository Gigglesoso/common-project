package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * ��ʽapi�ĳ��÷���
 */
public class StreamMethodTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("jack","tom","jim","lily");
		list.stream().forEach(str->System.out.println(str));//stream��ѭ������Ԫ�صķ���
		
		list.stream().map(str->str+1).forEach(str->System.out.println(str));//stream������Ԫ��ѭ��ӳ�䵽��һ��Ԫ��
		
		list.stream().filter(n->n.startsWith("j")).forEach(n->System.out.println(n));//stream�Ĺ��˷���
		
		list.stream().limit(2).forEach(str->System.out.println(str));//stream�Ľ�ȡ����
		
		List<String> subList = list.stream().limit(2).collect(Collectors.toList());//stream��collect�������Խ���ת��Ϊ��Ӧ��������
		System.out.println(subList);
		
		//stream�����򷽷���Ĭ��������
		List<Integer> newList = Arrays.asList(1,3,2,7,9);
		newList.stream().sorted().forEach(n->System.out.println(n));//Ĭ������
		newList.stream().sorted((a,b)->b-a).forEach(n->System.out.println(n));//�����Լ������������
		
		//stream��reduce���������ȳ���2��Ȼ����ͺ󷵻�
		Integer sum = newList.stream().map(n->n*2).reduce((a,b)->a+b).get();
		System.out.println(sum);
	}
}
