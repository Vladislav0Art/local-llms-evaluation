package app;

public class GeneratedTestAddNegative {

    public static String greet(String name) {
        return "Hello, " + name;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

class TestMain {

    @Test
    public void testAddNegative() {
        assertEquals(-1, Main.add(-1, -1));
    }

}