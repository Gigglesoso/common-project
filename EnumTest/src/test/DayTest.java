package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class DayTest {
	public static void main(String[] args) {
		Day[] values = Day.values();
		Stream<Day> stream = Arrays.stream(values);
		stream.forEach(x->System.out.println(x.ordinal()+" "+x.name()+" "+x.getDesc()));
	}
}
