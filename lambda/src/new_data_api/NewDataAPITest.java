package new_data_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class NewDataAPITest {
	public static void main(String[] args) {
		//��ȡ����ʱ��
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//��ȡ��ǰ������
		LocalDate localDate = dateTime.toLocalDate();
		System.out.println(localDate);
		
		//��ȡ��ǰ��ʱ��
		LocalTime localTime = dateTime.toLocalTime();
		System.out.println(localTime);
		
		//��ȡ��ǰ���·�
		Month month = dateTime.getMonth();
		System.out.println(month);
		
		//��ȡ��ǰ����
		int dayOfMonth = dateTime.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		
	}
}
