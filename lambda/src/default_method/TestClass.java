package default_method;

public class TestClass implements Interface1,Interface2{
//	/**
//	 * 直接调用指定接口的方法
//	 */
//	public void defaultMethod() {
//		Interface1.super.defaultMethod();
//	}
	/**
	 * 或者重写父接口的同名方法
	 */
	public void defaultMethod() {
		System.out.println("this is default method from testClass");
	}
}
