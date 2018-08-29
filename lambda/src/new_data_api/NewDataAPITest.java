package new_data_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class NewDataAPITest {
	public static void main(String[] args) {
		//获取本地时间
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//获取当前的日期
		LocalDate localDate = dateTime.toLocalDate();
		System.out.println(localDate);
		
		//获取当前的时间
		LocalTime localTime = dateTime.toLocalTime();
		System.out.println(localTime);
		
		//获取当前的月份
		Month month = dateTime.getMonth();
		System.out.println(month);
		
		//获取当前日期
		int dayOfMonth = dateTime.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		
	}
}
