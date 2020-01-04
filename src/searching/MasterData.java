package searching;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class MasterData {
	final static int size=100000;
	final static int maxElement=100;
	final static Random r=new Random();
	public  static Integer[] getArrayData() { 
		Integer [] integers=Stream.generate(()->r.nextInt(maxElement)).limit(size).toArray(Integer[]::new);
		return integers;
	}
	
	public  static Integer[] getSortedArrayData() {
		Random r=ThreadLocalRandom.current();
		Integer [] integers=IntStream.generate(()->r.nextInt(maxElement)).limit(size).sorted().boxed().toArray(Integer[]::new);
		return integers;
	}
	
	public static  int searchElement() {
		
		Integer[] integers=getArrayData();
		int shouldbeFound=integers[r.nextInt(maxElement-1)];
		return shouldbeFound;
		
	}
	
}
