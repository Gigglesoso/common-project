package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 流式api的常用方法
 */
public class StreamMethodTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("jack","tom","jim","lily");
		list.stream().forEach(str->System.out.println(str));//stream的循环所有元素的方法
		
		list.stream().map(str->str+1).forEach(str->System.out.println(str));//stream将所有元素循环映射到另一个元素
		
		list.stream().filter(n->n.startsWith("j")).forEach(n->System.out.println(n));//stream的过滤方法
		
		list.stream().limit(2).forEach(str->System.out.println(str));//stream的截取方法
		
		List<String> subList = list.stream().limit(2).collect(Collectors.toList());//stream的collect方法可以将流转换为相应的容器类
		System.out.println(subList);
		
		//stream的排序方法，默认是升序
		List<Integer> newList = Arrays.asList(1,3,2,7,9);
		newList.stream().sorted().forEach(n->System.out.println(n));//默认升序
		newList.stream().sorted((a,b)->b-a).forEach(n->System.out.println(n));//可以自己定义排序规则
		
		//stream的reduce方法，首先乘以2，然后求和后返回
		Integer sum = newList.stream().map(n->n*2).reduce((a,b)->a+b).get();
		System.out.println(sum);
	}
}
