class A1{
    void printA(){
        System.out.println("This is from Class A");
    }
}
 class B2 extends A1{
    void printB(){
        System.out.println("This is from Class B");
    }
}
class C3 extends B2{
    void printC(){
        System.out.println("This is from Class C");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        C3 objC = new C3();
        objC.printA();
        objC.printB();
        objC.printC();
    }
}
