package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.TestCase;

public class FibonacciSeries extends TestCase {

	public int fiboNth(int n) {
		if (n <= 1)
			return n;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 1);
		return fiboNth(n, map);
	}

	private int fiboNth(int n, Map<Integer, Integer> map) {

		if (n <= 1) {
			return map.get(n);
		}
		if (map.get(n) == null) {
			map.put(n, fiboNth(n - 2, map) + fiboNth(n - 1, map));
		}
		return map.get(n);
	}

	public static void main(String str[]) {

		System.out.println(new FibonacciSeries().fiboNth(30));
	}

	@Test
	public void testFiboNth() {
		assertEquals(1, fiboNth(2));

	}

	@Test
	public void testFiboNthI() {
		assertEquals(2, fiboNth(3));

	}

	@Test
	public void testFiboNthII() {
		assertEquals(832040, fiboNth(30));

	}

	@Test
	public void testFiboNthIII() {
		assertEquals(102334155, fiboNth(40));

	}
}
