package someCode.oneHundredPrint;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OneHundredPrint1 {
    private static Integer i = 1;
    private static final Integer MAX_NUM = 100;
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition1 = lock.newCondition();
    private static final Condition condition2 = lock.newCondition();
    private static boolean isOk = true;

    /**
     * 两个线程轮流打印 1-100
     * Condition接口的await、signal方法
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (i <= MAX_NUM) {
                lock.lock();
                try {
                    if (!isOk) {
                        //让线程进入等待，如果其他线程调用同一Condition对象的notify/notifyAll，那么等待的线程可能被唤醒
                        condition1.await();
                    } else {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        i++;
                        isOk = false;
                        //唤醒等待的线程
                        condition2.signal();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "ThreadTrue");

        Thread thread2 = new Thread(() -> {
            while (i <= MAX_NUM) {
                lock.lock();
                try {
                    if (isOk) {
                        condition2.await();
                    } else {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        i++;
                        isOk = true;
                        condition1.signal();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "ThreadFalse");

        thread1.start();
        thread2.start();
    }
}
