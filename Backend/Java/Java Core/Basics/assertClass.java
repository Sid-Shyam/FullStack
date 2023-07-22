public class assertClass {
    int age=98;
    public static void main(String[] args) {
             assertClass obj= new assertClass();
             obj.checkage();  
    }
    boolean checkage(){
        assert(age>18 && age<100):"Age entered is :"+age;
        if(age>18)
            {System.out.println("You can have fun");
            return true;}
        else
           { System.out.println("please go to home and play games");
            return false;
    }
    }
}
