class Dog{
    int a;
    {a=67;}
    void eating(){
        System.out.println("Eat");
    }
    
}
public class Check {
    public static void main(String[] args) {
        int a = 9;
        float f = 45.5f;
        {
            a= 20;
        }
        System.out.println(a++ + ++a);
        Dog d = new Dog();
        System.out.println(d.a);
    }   
}
