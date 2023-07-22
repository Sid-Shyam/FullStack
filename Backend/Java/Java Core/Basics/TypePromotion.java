public class TypePromotion {
    public static void main(String[] args) {
        byte a=10;
        byte b=30;
        int result=a*b;
        /*
         * Type Promotion
         * ---------------
         * here two byte values a ,b are 10 and 30
         * when we multiply 10*30 we get 300 which is out of bounds of bytes
         * java automatically promotes it. This is known as type promotion
         * so it promotes from byte to int
         */
        System.out.println("Type promoted value"+result);
    }    
}
