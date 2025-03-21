package thread.cas.spinlock;

import static util.MyLogger.*;

public class SpinLockMain {

	public static void main(String[] args) {
		// SpinLockBad spinLock = new SpinLockBad();
		SpinLock spinLock = new SpinLock();

		Runnable task = new Runnable() {
			@Override
			public void run() {
				spinLock.lock();
				try {
					log("비즈니스 로직 실행");
				} finally {
					spinLock.unlock();
				}
			}
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();
	}
}
