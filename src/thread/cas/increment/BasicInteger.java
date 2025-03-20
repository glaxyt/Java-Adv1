package thread.cas.increment;

public class BasicInteger implements IncrementInteger {

	public int value;

	@Override
	public void increment() {
		value++;
	}

	@Override
	public int get() {
		return value;
	}
}
