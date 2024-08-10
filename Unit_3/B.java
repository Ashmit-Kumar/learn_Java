package Unit_3;
// without lambda expression or using implements keywords
public class B implements Fu{
    @Override
    public String show(String a){
        return a;
    }
    
    public static void main(String[] args) {
        B ob=new B();
        ob.show("Ashmit");
    }


}
