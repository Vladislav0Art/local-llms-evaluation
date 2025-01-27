package net.revelc.code.formatter.css;

public class GeneratedTestToStringNull {

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
    public void testToStringNull() {
        assertThrows(NullPointerException.class, () -> LineEnding.Unix.toString(null));
    }

}