public class TypeConversion {
    public static void main(String[] args) {
        byte by=28;
        int a=44;
        a=by;//Implict type Conversion
        by=(byte)a;//Explict type Conversion known as Casting
        System.out.println(a);
        System.out.println(by);
        byte b=127;
        int num=257;
        //WE'll try to type caste into to byte
        /*
         * Logic
         * -------
         * When we try to type cate the int to byte and if the int has greater num than byte then,
         * for example int a=354; byte b=124;
         * b=(byte)a; the byte has max capacity (rangr) is -128 to 127 i.e total 256
         * So, it will modulus the given int nummber
         * as
         * 354%265==1;
         */
        b=(byte)num;
        System.out.println("Int was Casted to byte : "+b);
        //float
        float f=2.8f;
        byte c;
        c=(byte)f;
        System.out.println("Float value casted to byte and printed : "+c);
        short S;
        byte C;
        double d=(double)2844121f;
        float F=257.54f;
        S=(short)d;
        C=(byte)F;
        System.out.println("Folat casted to byte :"+C);
        System.out.println("Double casted to short    "+S);

    }
    
}
