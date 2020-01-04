package searching;

public interface SearchAlgorithm {

	public <T extends Comparable<T>> int find(T [] arr,T value);
}
