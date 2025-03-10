class Demo1{
    void fun(){
        final int x;
        x=78;
        System.out.println(x);
    }
}
public class FinalKeywordInInheritance {
    public static void main(String[] args) {
        Demo1 d= new Demo1();
        d.fun();   
    }
}
