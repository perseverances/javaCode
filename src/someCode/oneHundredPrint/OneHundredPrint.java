package someCode.oneHundredPrint;

public class OneHundredPrint {

    /**
     * 使用2个线程轮流打印 1-100数字
     */
    private static final Object lock = new Object();
    private static Integer i = 1;
    private static final Integer MAX_NUM = 100;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (i <= MAX_NUM) {
                synchronized (lock) {
                    if (i % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        i++;
                        //唤醒等待的线程
                        lock.notify();
                    } else {
                        try {
                            //当前线程等待
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }, "Thread-JI");


        Thread thread2 = new Thread(() -> {
            while (i <= MAX_NUM) {
                synchronized (lock) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        i++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }, "Thread-OU");

        thread1.start();
        thread2.start();

    }
}