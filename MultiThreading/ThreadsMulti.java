package MultiThreading;

public class ThreadsMulti extends Thread {
     private int ThreadNumber=0;
     public ThreadsMulti(int ThreadNumber){
     this.ThreadNumber=ThreadNumber;
     }
    @Override
    public void run(){
        System.out.println("I am Thread="+ThreadNumber);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
