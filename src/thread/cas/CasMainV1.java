package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger();
		System.out.println("start value = " + atomicInteger.get());

		boolean result1 = atomicInteger.compareAndSet(0, 1);
		// 만약 임계영역에 접근한 다른 스레드가 존재하지 않을 경우 임계 영역에 접근하고 값을 비교한다.
		System.out.println("result1 = " + result1 + ", value = " + atomicInteger.get()); // 1

		boolean result2 = atomicInteger.compareAndSet(0, 1);
		System.out.println("result1 = " + result2 + ", value = " + atomicInteger.get());
	}
}
