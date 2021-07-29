package Thread;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new B());
        Thread thread2 = new Thread(new A());
        thread1.start();
        thread2.start();
    }
}


class A implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<=10; i++){
            System.out.println("Class A"+ i);
        }
    }
}

class B implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<=10; i++){
            System.out.println("Class B"+ i);
        }
    }
}