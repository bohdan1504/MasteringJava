public class MyMultiThread extends Thread{

    @Override
    public void run(){

        for (int i = 10; i>0; i--){
            System.out.println("Thread #1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 is finished!");


        // FOR THE MAIN CLASS
        MyMultiThread thread1 = new MyMultiThread();

        MyRunnable runnable1 = new MyRunnable(); // if implements runnable interface instead (more widely used)
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
//        thread1.join(3000); //calling main thread waits until this thread dies
        thread2.start();

//        System.out.println(1/0); // the thread will still run, they run independently

        System.out.println(1/0);


    }
}
