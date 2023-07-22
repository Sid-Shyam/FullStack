public class methodOverriding{
    public static void main(String[] args) {
      B ob=new B();
      ob.display();  
    }
}
class A{
    protected void display(){
        System.out.println("Hi ");
    }

}
class B extends A{
    @Override
    protected void display(){
        System.out.println("Hello");
    }
}