// method overriding in java - when baseclass and subclass has same method with same signature and parameters
class A
{
    void show()     // same method on base class and child class
    {
        System.out.println("Base");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Derived");
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        A a = new A();
        a.show();
        B b = new B();
        b.show();
    }
}
