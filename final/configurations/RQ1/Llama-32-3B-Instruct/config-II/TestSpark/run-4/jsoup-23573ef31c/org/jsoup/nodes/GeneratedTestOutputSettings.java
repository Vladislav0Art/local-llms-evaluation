package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

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
    public void testOutputSettings() {
        assertEquals("utf-8", outputSettings.getCharset());
        assertArrayEquals(new String[]{"utf-8", "latin1"}, outputSettings.getEncoding());
    }
}

// Document.java
public class Document {
    private Connection connection;
    private OutputSettings outputSettings;
    // other fields and methods

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setOutputSettings(OutputSettings outputSettings) {
        this.outputSettings = outputSettings;
    }
}

// DocumentTest.java
public class DocumentTest {
    @Before
    public void setup() {
        document.setConnection(connection);
        document.setOutputSettings(outputSettings);
    }

}