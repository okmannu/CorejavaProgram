package Thread;

public class MovieBookT extends Thread{


    static  BookTheaterSeat b;
    int seats;
    @Override
    public void run() {

        b.bookSeat(seats);
    }


    public static void main(String[] args) {

        b = new BookTheaterSeat();
        MovieBookT manish = new MovieBookT();
        manish.seats = 7;
        manish.start();

        MovieBookT rahul = new MovieBookT();
        rahul.seats = 6;
        rahul.start();
    }
}

class BookTheaterSeat{

    int total_seat = 10;

    synchronized void bookSeat(int seat){

        if (total_seat >= seat){
            System.out.println(seat+" seats booked successfully ");
            total_seat=total_seat-seat;
            System.out.println("Seats Left :"+total_seat);
        }else {
            System.out.println("sorry seat con not be booked....!");
            System.out.println("Seats Left :"+total_seat);
        }
    }
}