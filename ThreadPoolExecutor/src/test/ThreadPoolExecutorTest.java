package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
	
	  /*ThreadPoolExecutor���캯���в����������£�
	   * int corePoolSize�����̳߳��к����߳������ֵ;
	   * int maximumPoolSize�� ���̳߳����߳��������ֵ;
	   * TimeUnit unit��keepAliveTime�ĵ�λ;
	   * BlockingQueue workQueue�����̳߳��е�������У�ά���ŵȴ�ִ�е�Runnable����;
	   * */	
	  private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(8, 12, 30,
		      TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50000), new ThreadPoolExecutor.AbortPolicy());
	  
	  public static ThreadPoolExecutor getThreadPool() {
		    return threadPool;
	  }
	  
	  public static void main(String[] args) {
		  threadPool.execute(new TestStreamTask());
		  threadPool.execute(new TestForTask());
	}
}
