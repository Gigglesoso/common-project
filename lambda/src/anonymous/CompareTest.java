package anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import anonymous.entity.User;
/**
 * @author Administrator
 * 比较器
 */
public class CompareTest {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setName("tom");
		user1.setAge(12);
		user1.setSex("male");
		list.add(user1);
		
		User user2 = new User();
		user2.setName("jack");
		user2.setAge(10);
		user2.setSex("male");
		list.add(user2);
		
		User user3 = new User();
		user3.setName("jack");
		user3.setAge(13);
		user3.setSex("male");
		list.add(user3);
		
		System.out.println(list);
		
		//java 1.8之前  匿名内部比较器类
		Collections.sort(list, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		//java 1.8之后 
		Collections.sort(list, (User o1, User o2)-> (o1.getAge()-o2.getAge()));
		
		System.out.println(list);
		
	}
}
