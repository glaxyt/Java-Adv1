package thread.cas.increment;

public class SyncInteger implements IncrementInteger {

	public int value;

	@Override
	public synchronized void increment() {
		value++;
	}

	@Override
	public synchronized int get() {
		return value;
	}
}
