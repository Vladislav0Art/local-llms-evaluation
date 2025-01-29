package org.jsoup.nodes;

public class GeneratedTest_location {

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
    public void test_location() {
        Document document = createShell("https://www.example.com");
        assertEquals("https://www.example.com", document.location());
    }

}