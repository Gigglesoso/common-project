package test;

import java.util.ArrayList;
import java.util.List;

public class TestForTask implements Runnable{
	private List<Integer> list;
	
	public TestForTask() {
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
		for(Integer number : list) {
			System.out.print(number);
		}
		long streamEnd = System.currentTimeMillis();
		System.out.println("forѭ��100000��ʹ��ʱ��Ϊ"+(streamEnd-streamBegin)+"ms");
	}
}
