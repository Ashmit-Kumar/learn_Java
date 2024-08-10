package MultiThreading;

public class Main{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
        ThreadsMulti obj=new ThreadsMulti(i);
        obj.start();
        ThreadsMulti ob=new ThreadsMulti(i);
        ob.start();
        }
    }
}