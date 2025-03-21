package thread.cas.spinlock;

import static util.MyLogger.*;
import static util.ThreadUtils.*;

public class SpinLockBad {

	private volatile boolean lock = false;

	public void lock() {
		log("락 흭득 시도");

		while (true) {
			if (!lock) {
				sleep(100);
				lock = true;
				break;
			} else {
				log("락 흭득 실패 - 스핀 대기");
			}
		}

		log("락 획득 완료");
	}

	public void unlock() {
		lock = false;
		log("락 반납 완료");
	}
}
