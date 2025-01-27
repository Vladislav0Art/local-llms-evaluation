package org.jsoup.nodes;

public class GeneratedTestParser {

    private int errorCount;

    public Parser() {
        this.errorCount = 0;
    }

    public void setErrorCount(int count) {
        this.errorCount = count;
    }

    public int getErrors() {
        return errorCount;
    }
}

public class OutputSettings {
    private String value;

    public OutputSettings() {
        this.value = "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class QuirksMode {
    public static final String NORMAL = "normal";
    public static final String INHERIT = "inherit";

    private String mode;

    public QuirksMode() {
        this.mode = NORMAL;
    }

    public String toString() {
        return mode;
    }
}

public class Charset {
    private String name;

    public Charset(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// GeneratedTest.java

public class Main {

    @Test
    public void testParser() {
        Parser parser = new Parser();
        parser.setErrorCount(1);
        assertEquals(1, parser.getErrors());
    }

}