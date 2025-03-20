package thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger implements IncrementInteger {

	AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public synchronized void increment() {
		atomicInteger.incrementAndGet();
	}

	@Override
	public synchronized int get() {
		return atomicInteger.get();
	}
}
