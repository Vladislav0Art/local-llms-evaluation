package org.jsoup.nodes;

public class GeneratedTest {

    private String source;
    private Parser parser;
    private Connection connection;
    private QuirksMode quirksMode;
    private OutputSettings outputSettings;
    private QuirksMode quirksModeDefault;
    private String html;

    public void setSource(String source) {
        this.source = source;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setQuirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
    }

    public OutputSettings outputSettings() {
        return outputSettings;
    }

    public void setOutputSettings(OutputSettings outputSettings) {
        this.outputSettings = outputSettings;
    }
}

public class Parser {
    private String source;
    private Document document;

    public void parse(String source) {
        this.source = source;
        // parsing logic
    }

    public Document getDocument() {
        return document;
    }
}

public class Connection {
    private String source;

    public void newRequest() {
        // connection logic
    }

    public String getSource() {
        return source;
    }
}

public class QuirksMode {
    public static final String noQuirks = "noQuirks";
    public static final String quirks = "quirks";
    public static final String limitedQuirks = "limitedQuirks";

    private QuirksMode(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}

public class OutputSettings {
    private boolean prettyPrint;
    private int indentAmount;
    private int maxPaddingWidth;

    public void setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public void setIndentAmount(int indentAmount) {
        this.indentAmount = indentAmount;
    }

    public void setMaxPaddingWidth(int maxPaddingWidth) {
        this.maxPaddingWidth = maxPaddingWidth;
    }
}

public class QuirksModeTest {

    @Test
    public void testQuirksMode() {
        assertSame(QuirksMode.noQuirks, new QuirksMode("noQuirks").getValue());
        assertSame(QuirksMode.quirks, new QuirksMode("quirks").getValue());
        assertSame(QuirksMode.limitedQuirks, new QuirksMode("limitedQuirks").getValue());
    }

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setPrettyPrint(true);
        outputSettings.setIndentAmount(4);
        outputSettings.setMaxPaddingWidth(10);

        assertSame(true, outputSettings.getPrettyPrint());
        assertEquals(4, outputSettings.indentAmount());
        assertEquals(10, outputSettings.getMaxPaddingWidth());
    }

}