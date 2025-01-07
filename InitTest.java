public class InitTest {
    static int cv = 1;
    int iv = 1;

    static { cv = 2; }

    { iv = 2; }

    public InitTest() {
        iv = 3;
    }

}
