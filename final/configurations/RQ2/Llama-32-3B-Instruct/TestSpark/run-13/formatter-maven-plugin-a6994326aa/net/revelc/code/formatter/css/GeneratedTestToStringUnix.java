package net.revelc.code.formatter.css;

public class GeneratedTestToStringUnix {

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
    public void testToStringUnix() {
        LineEnding lineEnding = LineEnding.Unix;
        assertEquals("\n", lineEnding.toString());
    }

}