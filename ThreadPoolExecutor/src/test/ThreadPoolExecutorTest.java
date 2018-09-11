package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
	
	  /*ThreadPoolExecutor构造函数中参数意义如下：
	   * int corePoolSize：该线程池中核心线程数最大值;
	   * int maximumPoolSize： 该线程池中线程总数最大值;
	   * TimeUnit unit：keepAliveTime的单位;
	   * BlockingQueue workQueue：该线程池中的任务队列：维护着等待执行的Runnable对象;
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
