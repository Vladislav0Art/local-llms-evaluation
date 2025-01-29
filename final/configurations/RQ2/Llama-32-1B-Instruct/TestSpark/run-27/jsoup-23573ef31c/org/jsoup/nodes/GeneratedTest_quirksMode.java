package org.jsoup.nodes;

public class GeneratedTest_quirksMode {

    private String baseUri;
    private Connection connection;

    public Document(String baseUri) {
        this.baseUri = baseUri;
        initConnection();
    }

    public static Document createShell(String baseUri) {
        return new Document(baseUri);
    }

    @Before("document")
    public void setUp() {
    }

    public String location() {
        try {
            Document document = parseDocument();
            return document.location();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Connection connection() {
        try {
            return parseConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String outerHtml() {
        try {
            Document document = parseDocument();
            return document.outerHtml();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Element text(String text) {
        try {
            Document document = parseDocument();
            Element element = document.text(text);
            if (element == null || element instanceof FormElement) {
                return null;
            } else {
                return element;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String nodeName() {
        try {
            Document document = parseDocument();
            return document.nodeName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void charset(Charset charset) {
        if (connection != null && connection.getCharset() == null || !charset.equals(connection.getCharset())) {
            connection.updateMetaCharsetElement(true);
        }
    }

    @Override
    public Document clone() {
        try {
            return parseDocument();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Document shallowClone() {
        try {
            return parseDocument();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OutputSettings outputSettings() {
        if (connection != null && connection.getOutputSettings() == null || !connection.getOutputSettings().equals(this.outputSettings())) {
            connection.updateMetaCharsetElement(true);
        }
        return this.outputSettings();
    }

    @Override
    public Document outputSettings(OutputSettings outputSettings) {
        if (outputSettings != null) {
            outputSettings = outputSettings.copy();
            if (connection == null || !connection.getOutputSettings().equals(outputSettings)) {
                connection.updateMetaCharsetElement(true);
            }
        }
        return this.outputSettings();
    }

    public QuirksMode quirksMode() {
        try {
            Document document = parseDocument();
            return document.quirksMode();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Document quirksMode(QuirksMode quirksMode) {
        if (connection == null || !connection.getQuirksMode().equals(quirksMode)) {
            connection.updateMetaCharsetElement(true);
        }
        return this.quirksMode();
    }

    private Connection parseConnection() throws Exception {
        if (connection == null) {
            String url = "http://" + baseUri;
            return Jsoup.connect(url).get();
        } else {
            return connection;
        }
    }

    @Test
    public void test_quirksMode() {
        QuirksMode standard = new QuirksMode("standard");
        QuirksMode custom = new QuirksMode("custom");

        Document document1 = createShell("https://www.example.com", "https://example.com/standard.css").quirsksMode(standard);
        Document document2 = createShell("https://www.example.com", "https://example.com/custom.css").quirksMode(custom);

        assertEquals(QuirksMode.QUIRKS_MODE_STANDARD, standard.quirksMode());
        assertEquals(QuirksMode.QUIRKS_MODE_CUSTOM, custom.quirksMode());

        Document document3 = createShell("https://www.example.com").quirksMode(standard);
        assertEquals(QuirksMode.QUIRKS_MODE_STANDARD, standard.quirksMode());

        try {
            QuirksMode.QUIRKS_MODE_INVALID quirkMode = new QuirksMode("invalid");
            Document document4 = createShell("https://www.example.com").quirksMode(quirkMode);
            assert false;
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid quirks mode", e.getMessage());
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        QuirksMode quirkMode = (QuirksMode) other;
        return this.quirksMode().equals(quirkMode);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.quirksMode() == null || getClass().getClassId() != 0 ? 0 : getClass().hashCode()) * 17);

        return result;
    }
}

public class FormElement {

    @Override
    public String nodeName() {
        return "form";
    }

    @Override
    public Document text(String text) {
        return null;
    }

}