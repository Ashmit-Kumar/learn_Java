package MultiThreading;

public class ThowException {
    public static void main(String[] args) {
        try{
            help();
        }
        catch(NullPointerException e){
            System.out.println("Exception from Main");
            System.out.println(e);
        }
    }
    public static void help(){
        try{
            throw new NullPointerException("Error Unknown");
            
        }
        catch(NullPointerException e){
            System.out.println("Hello from help");
            System.out.println(e);
        }
    }
}
