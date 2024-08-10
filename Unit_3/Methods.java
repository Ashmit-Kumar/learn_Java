package Unit_3;

import java.util.Arrays;
import java.util.List;

//Method and constructor reference
public class Methods {
    public static void print(int x){
        System.out.print(x+" ");
    }
    public static void main(String[] args) {
        List<Integer> student=Arrays.asList(1,4,2,6,5,7);
        //student=[1,4,2,6,5,7]
        student.forEach(x->System.out.println(x));
        student.forEach(Methods::print);
    }
}
//:: refernce 
