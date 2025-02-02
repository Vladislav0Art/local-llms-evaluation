package org.jsoup.nodes;

public class GeneratedTest {

    private String charset;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return charset;
    }
}

public class DocumentBuilderTest {

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setCharset("UTF-8");
        assertEquals("UTF-8", outputSettings.getCharset());
    }

    @Test
    public void testDocumentBuilder() {
        Document document = Document.builder()
                .outputSettings(new OutputSettings().setCharset("UTF-8"))
                .parser(Parser.builder())
                .connection(Connection.builder())
                .build();
        assertNotNull(document);
    }
}

public class Document {
    private String charset;

    public static Document builder() {
        return new Document();
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return charset;
    }
}

public class Parser {
    public static Parser builder() {
        return new Parser();
    }
}

public class Connection {
    public static Connection builder() {
        return new Connection();
    }

}