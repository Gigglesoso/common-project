package test;

import java.util.ArrayList;
import java.util.List;


public class TestStreamTask implements Runnable{
	
	private List<Integer> list;
	
	public TestStreamTask() {
		this.initList();
	}
	
	private List<Integer> initList() {
		list = new ArrayList<>();
		for(int i = 0;i<100000;i++) {
			list.add(i);
		}
		return list;
	}
	
	@Override
	public void run() {
		long streamBegin = System.currentTimeMillis();
		list.stream().forEach(x->System.out.print(x));
		long streamEnd = System.currentTimeMillis();
		System.out.println("stream循环100000次使用时间为"+(streamEnd-streamBegin)+"ms");
	}
}
