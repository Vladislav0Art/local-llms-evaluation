package org.jsoup.nodes;

public class GeneratedTest {

    public void parse() {
    }
}

public class QuirksMode {
    public static final QuirksMode noQuirks = new QuirksMode();
    public static final QuirksMode quirks = new QuirksMode();
    public static final QuirksMode limitedQuirks = new QuirksMode();

    private QuirksMode() {
    }
}

public class Document {
    private QuirksMode quirksMode;

    public void setQuirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
    }

    public String getQuirksMode() {
        return "noQuirks";
    }

    public OutputSettings outputSettings() {
        return new OutputSettings();
    }
}

public class OutputSettings {
    private String charset;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return this.charset;
    }
}

public class DocumentTests {

    @Test
    public void testDocumentQuirksMode() {
        Document document = new Document();
        assertEquals("noQuirks", document.getQuirksMode());
        document.setQuirksMode(QuirksMode.noQuirks);
        assertEquals(QuirksMode.noQuirks, document.getQuirksMode());
    }

    @Test
    public void testDocumentOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setCharset("UTF-8");
        Document document = new Document();
        document.setQuirksMode(QuirksMode.noQuirks);
        assertEquals(outputSettings.getCharset(), document.outputSettings().getCharset());
    }

    @Test
    public void testDocumentConstruction() {
        Document document = new Document();
    }

}