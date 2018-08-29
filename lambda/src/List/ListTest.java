package List;

import java.util.Arrays;
import java.util.List;
/**
 * @author Administrator
 * ʹ��Lambda���ʽѭ��List
 */
public class ListTest {
	public static void main(String[] args) {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		
		//before 1.8
			//forѭ��
		for (int i = 0; i < features.size(); i++) {
			System.out.println("forѭ���� "+features.get(i));
		}
			//��ǿforѭ��
		for(String feature:features) {
			System.out.println("��ǿforѭ���� "+feature);
		}
		
		//after 1.8
			// 1 lambda���ʽ
		features.forEach(n->System.out.println("Lambda���ʽ��"+n));
			// 2 ����������::˫ð�Ų�������ʾ  ?��δ�������
		features.forEach(System.out::println);
	}
}
