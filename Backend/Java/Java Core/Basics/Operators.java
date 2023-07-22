public class Operators {
    int num=3;
    int result;
    public static void main(String[] args) {
    Operators obj=new Operators();
    obj.post();
    
    System.out.println(obj.num);
    obj.pre();    
    }
    
    void pre(){
        result=++num;
        /*There are two operations in ++num. There are first incrementing operation then added to variable value */
        System.out.println("pre-Increment :"+result);
        }
    void post(){
        result=num++;
        /*There are two operations in num++. There are first fetch the value from variable then incrementing it */
        System.out.println("post-Increment :"+result);
        }
}
