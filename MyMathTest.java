class MyMath{
    long a, b;

    long add(){ return a + b; } // a, b are instance vars.

    static long add(long a, long b){ return a + b; } // a, b are local vars.
}

public class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.add(100L, 200L));

        MyMath mm = new MyMath();
        mm.a = 200;
        mm.b = 400;
        System.out.println(mm.add());
    }
}
