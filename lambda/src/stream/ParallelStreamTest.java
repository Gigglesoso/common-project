package stream;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 */
public class ParallelStreamTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 100000; i++) {
			list.add(i+"");
		}
//		Long startTime = System.currentTimeMillis();
//		list.stream().forEach(str->System.out.println("当前线程"+Thread.currentThread()+" 值为:"+str));
//		Long endTime = System.currentTimeMillis();
//		System.out.println("耗时："+(endTime-startTime)+"ms");     //1050ms   按顺序输出
		
		
		Long aStartTime = System.currentTimeMillis();
		list.parallelStream().forEach(str->System.out.println("当前线程"+Thread.currentThread()+" 值为:"+str));
		Long bEndTime = System.currentTimeMillis();
		System.out.println("耗时："+(bEndTime-aStartTime)+"ms");   //1253ms   输出是无序的
	}
}
