package Unit_3;
/*
 * InnerClass: Jab hm ek class ke andar dusri class bnate hai 
 * There are 4 types of innerclasses
 * 1) Nested inner Class/Normal inner class
 * 2) Static Nested class
 * 3) Local method inner class
 * 4) anonymous inner class
 */
public class OuterClass {
   public void show(){
    System.out.println("Hello This is OuterClass Show Function");
   }
//1) Nested inner class
   public class InnerClass{
    public void hey(){
        System.out.println("This is inner Class Hey function");
    }
   }

   //2) Static inner class
   public static class InnerClass2{
    public void hey2(){
     System.out.println("This is innerclass2");
    } 
 }

 //Method Local innerClass
   public void show2(){
    System.out.println("Hello");
    class LocalInnerClass{
        public void inn(){
            System.out.println(" World");

        }
    }
    LocalInnerClass ob=new LocalInnerClass();
    ob.inn();
   }



   public static void main(String[] args) {
   OuterClass obj=new OuterClass();
   obj.show();
   obj.show2();

   //Calling Nested inner class
   OuterClass.InnerClass ob=obj.new InnerClass();
   ob.hey();

  // static inner class
  OuterClass.InnerClass2 inner=new OuterClass.InnerClass2();
  inner.hey2();
   }
  
}
