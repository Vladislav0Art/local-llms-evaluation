package net.revelc.code.formatter.css;

public class GeneratedTest {

    private String value;

    public LineEnding(String value) {
        this.value = value;
    }

    public static final LineEnding UNIX = new LineEnding("\n");
    public static final LineEnding MAC = new LineEnding("\\r\\n");

    public String getValue() {
        return value;
    }
}

public class LineEndingTest {

}