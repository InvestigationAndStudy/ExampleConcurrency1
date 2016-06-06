package study.concurrency3;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		FileSearch searcher = new FileSearch("/home/venya", "autoexec.bat");
		Thread thread = new Thread(searcher);
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
