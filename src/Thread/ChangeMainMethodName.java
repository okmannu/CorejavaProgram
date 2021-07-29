package Thread;


/*
   currentThread is static method
   getName()-> current thread name
   setName()-> is set your thread name

*/




public class ChangeMainMethodName {

    public static void main(String[] args) {

   /*     System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("manish");
        System.out.println(Thread.currentThread().getName());*/

        DaemonDemo daemonDemo = new DaemonDemo();
       // creating  daemon  thread before start() always
      // daemonDemo.setDaemon(true);
       daemonDemo.start();



    }
}

class DaemonDemo extends  Thread {

    public void  run()
{
    if (Thread.currentThread().isDaemon()){
        System.out.println("Thread is Daemon thread");
    }else {
        System.out.println("Child thread");
    }
}
}