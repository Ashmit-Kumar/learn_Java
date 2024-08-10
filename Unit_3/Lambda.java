package Unit_3;
// a functional Interface with a method that recieves one value and returns another
// lambda expression are used to implement functional interfaces

interface Drawable{
    String draw();
}
public class Lambda {
    public static void main(String[] args) {
        Drawable ob=()->{
            String s="Ashmit";
            return s;
        };
       System.out.println(ob.draw());
    }
}
