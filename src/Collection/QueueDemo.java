package Collection;

public class QueueDemo {

    //  inserting value Queue

    int Queue[] = new int[5];
    int front;
    int rear;
    int size;

    // enQueue
    public void enQueue(int data) {
        Queue[rear] = data;
       // rear = rear + 1;
         rear = (rear +1)%5;
        size = size + 1;
    }

    //Dequeue
    public int deQueue() {

        int data = Queue[front];
       // front = front + 1;
        front = (front+1)%5;

        size = size - 1;

        return data;
    }

    public int getSize(){
        return  size;
    }

    public int isEmpty()
    {
        return size;
    }

    public void show() {
        for (int i = 0; i < size; i++) {

               System.out.print(Queue[i] +" ");

       //     System.out.println(Queue[front + i] + " ");

            // System.out.println(Queue[(front+i)%5]+ " ");



        }
        System.out.println("size _ "+ size);

        System.out.println("length" +Queue.length);

        System.out.println(".............for each loop.................");
        {
            for (int n : Queue
            ) {
                System.out.print(n + " ");
            }
        }
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();

        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);
        q.enQueue(10);

        System.out.println(".................all data..................");
        q.show();


        System.out.println(".................remove two element..................");
        q.deQueue();    // swifting the point
        q.deQueue();
        q.show();


      // q.enQueue(6);   // ArrayIndexoutOfBoundExcepion // add rear = (rear+1)%5
                                                          // add front =(front+1)%5
                                                         //sout([(front+[i])%5])
        System.out.println(".................add two element..................");
         q.enQueue(6);
         q.enQueue(7);
         q.show();
    }


}