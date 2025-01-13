public class InstanceOfTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        if(fe instanceof FireEngine){
            System.out.println("fe instanceof FireEngine");
        }
        if (fe instanceof Car) {
            System.out.println("fe instanceof Car");
        }
        if (fe instanceof Object) {
            System.out.println("fe instanceof Object");
        }

    }
}

class Car{}
class FireEngine extends Car{}