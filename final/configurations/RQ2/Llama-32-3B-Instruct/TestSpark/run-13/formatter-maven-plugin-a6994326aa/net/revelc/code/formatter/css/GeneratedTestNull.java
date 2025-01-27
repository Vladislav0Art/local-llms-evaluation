package net.revelc.code.formatter.css;

public class GeneratedTestNull {

    public static final int Unix = 0;
    public static final int Mac = 1;

    public static String toString(int lineEnding) {
        if (lineEnding == Unix) return "\n";
        else if (lineEnding == Mac) return "\\r\\n";
        else throw new IllegalArgumentException("Invalid line ending");
    }
}

public class LineEndingTest {

    @Test
    public void testNull() {
        assertThrows(NullPointerException.class, () -> LineEndingPublicMethods.toString(null));
    }

}