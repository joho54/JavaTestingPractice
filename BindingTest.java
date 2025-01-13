public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println(p.x);
        System.out.println(p.method());
        System.out.println(p.s);
        System.out.println(c.x);
        System.out.println(c.method());
        System.out.println(p.s);
        
    }
}


class Parent{
    int x = 100;    
    String s = "parent!";
    String method(){
        return "parent method";
    }
}
class Child extends Parent{
    int x = 400;    
    String s = "child!";
    String method(){
        return "child method";
    }
}