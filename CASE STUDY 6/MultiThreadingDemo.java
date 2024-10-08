public class MultiThreadingDemo {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        MyThread mt1 = nwe MyThread("thread1" , d1);
        MyThread mt1 = nwe MyThread("thread2" , d1);
        MyThread mt1 = nwe MyThread("thread3" , d2);
    }
}

class MyThread implements Runnable{
    Demo d;
    Thread t;

    public MyThread(Demo d, Thread t) {
        this.d = d;
        this.t = t;
    }
}
