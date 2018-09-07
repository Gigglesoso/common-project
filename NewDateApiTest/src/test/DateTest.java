package test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
	public static void main(String[] args) throws InterruptedException {
		//�滻long currentTimeMillis = System.currentTimeMillis();
		Instant start = Instant.now();
		Thread.sleep(1000);
		Instant end = Instant.now();
		Duration between = Duration.between(start, end);
		System.out.println("����ִ����"+between.toMillis()+"ms");
		System.out.println("-----------------------------------------------------");
		
		
		//�滻Date��Calendar   ��LocalDate(ֻ������)��LocalDateTime(�����ں�ʱ��)��LocalTime(��ʱ��),��ʽ��ʱ��ע��
		LocalDate now = LocalDate.now();//LocalDate
		System.out.println("��ǰ���ڣ�"+now);
		LocalDate plusDays = now.plusDays(5);
		System.out.println("����5������ڣ�"+plusDays);
		System.out.println("-----------------------------------------------------");
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println("��ǰ���ڣ�"+now2);
		LocalDateTime minusDays = now2.minusDays(5);
		System.out.println("����5������ڣ�"+minusDays);
		System.out.println("-----------------------------------------------------");
		
		LocalTime now3 = LocalTime.now();
		System.out.println("��ǰʱ�䣺"+now3);
		LocalDateTime plusMinutes = now2.plusMinutes(10);
		System.out.println("����5���Ӻ�ʱ�䣺"+plusMinutes);
		System.out.println("-----------------------------------------------------");
		
		
		//�滻SimpleDateFormate   ʹ��DateTimeFormatter
		LocalDateTime now4 = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//ע��ʱ����
		String formatDateTime = formatter.format(now4);
		System.out.println(formatDateTime);
		System.out.println("-----------------------------------------------------");
		LocalDateTime dateTime = LocalDateTime.parse("2017��03��06�� 06ʱ56��32��", DateTimeFormatter.ofPattern("yyyy��MM��dd�� HHʱmm��ss��"));
		System.out.println(dateTime);
		
		
	}
}
