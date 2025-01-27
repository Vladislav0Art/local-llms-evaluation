package net.revelc.code.formatter.css;

public class GeneratedTestInvalidValue {

    private String value;

    public LineEnding(String value) {
        this.value = value;
    }

    public static final LineEnding Unix = new LineEnding("\n");
    public static final LineEnding Mac = new LineEnding("\\r\\n");

    public String toString() {
        return value;
    }
}

public class LineEndingTest {

    @Test
    public void testInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> new LineEnding("-1").toString(-1));
    }
}

public class LineEndingPublicMethods {

    private String value;

    public LineEndingPublicMethods(String value) {
        this.value = value;
    }

    public static final LineEndingPublicMethods Unix = new LineEndingPublicMethods("\n");
    public static final LineEndingPublicMethods Mac = new LineEndingPublicMethods("\\r\\n");

    public String toString(int lineEnding) {
        if (lineEnding == 0) return "\n";
        else if (lineEnding == 1) return "\\r\\n";
        else throw new IllegalArgumentException("Invalid value");
    }

    public static void main(String[] args) {
        LineEndingPublicMethods lineEnding = new LineEndingPublicMethods(null);
        assertThrows(NullPointerException.class, () -> lineEnding.toString(null));
    }

}