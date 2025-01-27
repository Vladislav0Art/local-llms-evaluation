package org.jsoup.parser;

public class GeneratedParseFragment_ValidXmlReader_ValidDocument {

    @Test
    public void parseFragment_ValidXmlReader_ValidDocument() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        Document document = builder.parseFragment(new StringReader("<root><child/></root>"), settings);
        assertNotNull(document);
        assertEquals("root", document.title());
    }
}

public class XmlTreeBuilder {
    public ParseSettings defaultSettings() {
        return new ParseSettings();
    }

    public void initialiseParse(Reader xml, ParseSettings settings) throws IOException {
        // Implementation
    }

    public Document parse(Reader xml, ParseSettings settings) {
        // Implementation
        return new Document();
    }

    public Document parseFragment(Reader xml, ParseSettings settings) {
        // Implementation
        return new Document();
    }
}

public class ParseSettings {
    public String title;

    public void setTitle(String title) {
        this.title = title;
    }
}

public class Reader {
    @Override
    public boolean equals(Object obj) {
        // Implementation
        return false;
    }

    @Override
    public int hashCode() {
        // Implementation
        return 0;
    }
}

public class Document {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}