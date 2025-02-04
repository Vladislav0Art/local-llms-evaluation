package org.jsoup.nodes;

public class GeneratedTestDocument {

    private String charset;
    private String[] encoding;

    public OutputSettings(String charset) {
        this.charset = charset;
        this.encoding = new String[]{"utf-8"};
    }

    public void setCharset(String charset) {
        this.charset = charset;
        this.encoding[0] = charset;
    }

    public void setEncoding(String[] encoding) {
        this.encoding = encoding;
    }

    // getters and setters
}

// OutputSettingsTest.java
public class OutputSettingsTest {
    @Before
    public void setup() {
        outputSettings.setCharset("utf-8");
        outputSettings.setEncoding(new String[]{"utf-8", "latin1"});
    }

    @Test
    public void testDocument() {
        assertEquals(connection, document.getConnection());
        assertEquals(outputSettings, document.getOutputSettings());
    }

}