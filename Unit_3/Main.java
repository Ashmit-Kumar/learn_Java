package Unit_3;

public class Main {
    public static void main(String[] args) {
        AnonymousInner ob=new AnonymousInner(){
            @Override
            public void show3(){
                System.out.println("This is nnnnnnnnn");
            }   
        };
        ob.show3();
        AnonymousInner obj=new AnonymousInner();
        obj.show3();
    }
}
