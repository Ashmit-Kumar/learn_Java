package Unit_3;
//Using anonymous class
public class C {
    public static void main(String[] args) {
        Fu ob=new Fu(){
        @Override
        public String show(String a){
            return a;
        }
        };
        System.out.println(ob.show("Ashmit"));
    }
}
