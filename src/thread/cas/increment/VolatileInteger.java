package thread.cas.increment;

public class VolatileInteger implements IncrementInteger {

	volatile public int value;

	@Override
	public void increment() {
		value++;
	}

	@Override
	public int get() {
		return value;
	}
}
