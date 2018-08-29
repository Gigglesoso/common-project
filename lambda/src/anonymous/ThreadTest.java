package anonymous;
/**
 * @author Administrator
 * lumbda实现匿名内部类
 * 三种用法：
 * (params) -> expression
 * (params) -> statement
 * (params) -> { statements }
 */
public class ThreadTest {
	public static void main(String[] args) {
		//java8  之前
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before java8");
			}
		}).start();
		
		//java8  之后
		new Thread(() -> System.out.println("After java8")).start();
	}
}
