public class MyThread extends Thread{

    // for Main class
//    System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("MAINNNNNNN");
//
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().isAlive());
//
//        for (int i=3; i>0; i--){
//        System.out.println(i);
//        Thread.sleep(1000);
////        }
////
//
//        MyThread thread2 = new MyThread();
//        thread2.setDaemon(false);
//        System.out.println(thread2.isDaemon());
//        thread2.start();




        @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("This is a daemon thread that is running");
        }
        else {
            System.out.println("This is a user thread that is running");
        }
    }

}
