public class Pthread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
    //    throw new RuntimeException();
  //    myThread.;

        System.out.println("main"); //MainThread
        System.out.println("main1"); //Main1Thread
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("thread0"); //Thread 0
    }


}
