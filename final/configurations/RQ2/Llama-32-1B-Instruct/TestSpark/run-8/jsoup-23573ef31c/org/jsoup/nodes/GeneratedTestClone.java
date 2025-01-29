package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() throws Exception {
        String baseUri = "http://example.com";
        Document document = new DocumentDocument(baseUri);
        Document cloned = (Document) document.clone();
        assertNotNull(cloned);
        assertEquals(document, cloned);
    }
}

public interface DocumentParser extends Parser {
}

public class DocumentParserImpl implements DocumentParser {
    @Override
    public void setupParser() {
        // implementation
    }

    @Override
    public Document parse(String html) throws Exception {
        // implementation
    }

    @Override
    public Parser getParser() {
        return this;
    }
}

public interface OutputSettings {
    int getQuirksMode();
}

public class DocumentOutputSettingsImpl implements OutputSettings {
    private QuirksMode quirksMode;

    public QuirksMode getQuirksMode() {
        return quirksMode;
    }

    public void setQuirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
    }

}