
// multiple inheritance we used interfaces to do that
interface A{
    // abstract method
    public void show();
}
interface B{
    public void show2();
}
// interface is the blueprint for class
// whatever we declare variables and methods inside interface are the blueprint for class
public class MultipleInheritance implements A,B{
    public void show()  // definition for abstract method
    {
        System.out.println("A Interface");
    }
    public void show2(){
        System.out.println("B Interface");
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.show();
        m.show2();
    }
}
