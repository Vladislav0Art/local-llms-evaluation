package org.jsoup.nodes;

public class GeneratedTestCommentCreation {

    @Test
    public void testCommentCreation() {
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("< invalid xml fragment >", null);
        assertNotNull(doc);
        assertEquals(1, doc.elementCount());
    }
}

public class Comment {
    private String name;
    private String value;

    public Comment(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public boolean isXmlDeclaration() {
        return "xml_declaration".equals(name);
    }

    public XmlDeclaration asXmlDeclaration() {
        return new XmlDeclaration("xml_declaration", value);
    }
}

public class XmlDeclaration {
    private String name;
    private String value;

    public XmlDeclaration(String name, String value) {
        this.name = name;
        this.value = value;
    }

}