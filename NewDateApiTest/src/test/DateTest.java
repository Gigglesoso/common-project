package test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
	public static void main(String[] args) throws InterruptedException {
		//替换long currentTimeMillis = System.currentTimeMillis();
		Instant start = Instant.now();
		Thread.sleep(1000);
		Instant end = Instant.now();
		Duration between = Duration.between(start, end);
		System.out.println("程序执行了"+between.toMillis()+"ms");
		System.out.println("-----------------------------------------------------");
		
		
		//替换Date和Calendar   有LocalDate(只有日期)，LocalDateTime(有日期和时间)，LocalTime(有时间),格式化时候注意
		LocalDate now = LocalDate.now();//LocalDate
		System.out.println("当前日期："+now);
		LocalDate plusDays = now.plusDays(5);
		System.out.println("增加5天后日期："+plusDays);
		System.out.println("-----------------------------------------------------");
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println("当前日期："+now2);
		LocalDateTime minusDays = now2.minusDays(5);
		System.out.println("减少5天后日期："+minusDays);
		System.out.println("-----------------------------------------------------");
		
		LocalTime now3 = LocalTime.now();
		System.out.println("当前时间："+now3);
		LocalDateTime plusMinutes = now2.plusMinutes(10);
		System.out.println("增加5分钟后时间："+plusMinutes);
		System.out.println("-----------------------------------------------------");
		
		
		//替换SimpleDateFormate   使用DateTimeFormatter
		LocalDateTime now4 = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//注意时分秒
		String formatDateTime = formatter.format(now4);
		System.out.println(formatDateTime);
		System.out.println("-----------------------------------------------------");
		LocalDateTime dateTime = LocalDateTime.parse("2017年03月06日 06时56分32秒", DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
		System.out.println(dateTime);
		
		
	}
}
