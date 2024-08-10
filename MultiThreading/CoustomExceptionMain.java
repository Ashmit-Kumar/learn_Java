package MultiThreading;

public class CoustomExceptionMain {
    public static void main(String[] args) {
        try{
          throw new CoustomException("Hello This is a Coustom Exception");
        }
        catch(CoustomException e){
            System.out.println("Hello");
            System.out.println(e.getMessage());
        }
    }
}
