package anonymous;
/**
 * @author Administrator
 * lumbdaʵ�������ڲ���
 * �����÷���
 * (params) -> expression
 * (params) -> statement
 * (params) -> { statements }
 */
public class ThreadTest {
	public static void main(String[] args) {
		//java8  ֮ǰ
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before java8");
			}
		}).start();
		
		//java8  ֮��
		new Thread(() -> System.out.println("After java8")).start();
	}
}
