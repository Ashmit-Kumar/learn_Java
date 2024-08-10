package Unit_3;

public class Predicate_Implementation {
 public static void main(String[] args) {
    Predicate<Integer> ob=(Integer num)->{
        if(num>10){
            return true;
        }
        else{
            return false;
        }
    };
    Predicate<String> obj=(String name)->{
    if(name.length()>5){
        return true;
    }
    else{
        return false;
    }
    };
    System.out.println(ob.test(39));
 }   
}
