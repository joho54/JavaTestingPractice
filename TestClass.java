public class TestClass {
    void instanceMethod(){} // instance method
    static void staticMethod(){} //static method(class method)

    void instanceMethod2(){ // instance method
        instanceMethod(); // call another member instance method 
        staticMethod(); // call another member static method(class method)
    }

    static void staticMethod2(){
        // instanceMethod(); // error! static method cannot call static method.
        staticMethod(); // static method can only call static method.

    }
}
