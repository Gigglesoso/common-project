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
//		list.stream().forEach(str->System.out.println("��ǰ�߳�"+Thread.currentThread()+" ֵΪ:"+str));
//		Long endTime = System.currentTimeMillis();
//		System.out.println("��ʱ��"+(endTime-startTime)+"ms");     //1050ms   ��˳�����
		
		
		Long aStartTime = System.currentTimeMillis();
		list.parallelStream().forEach(str->System.out.println("��ǰ�߳�"+Thread.currentThread()+" ֵΪ:"+str));
		Long bEndTime = System.currentTimeMillis();
		System.out.println("��ʱ��"+(bEndTime-aStartTime)+"ms");   //1253ms   ����������
	}
}
