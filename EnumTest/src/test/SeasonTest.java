package test;

import java.util.Arrays;
import java.util.stream.Stream;
/**
 * Season≤‚ ‘¿‡
 * @author Administrator
 */
public class SeasonTest {
	public static void main(String[] args) {
		Season[] values = Season.values();
		Stream<Season> stream = Arrays.stream(values);
		stream.forEach(x->System.out.println(x.ordinal()+" "+x.name()+" "+x.getDesc()));
	}
}
