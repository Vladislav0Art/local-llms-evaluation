package net.revelc.code.formatter.css;

public class GeneratedTestToStringMac {

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
    public void testToStringMac() {
        LineEnding lineEnding = LineEnding.Mac;
        assertEquals("\\r\\n", lineEnding.toString());
    }

}