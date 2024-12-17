package org.jsoup.nodes;

public class GeneratedTestCommentIsXmlDeclaration {

    private boolean isXmlDeclaration;

    public Comment(String text) {
        super(text);
        this.isXmlDeclaration = false;
    }

    public boolean isXmlDeclaration() {
        return isXmlDeclaration;
    }
}

class XmlDeclaration extends org.jsoup.nodes.Element {
    private boolean isXmlDeclaration;

    public XmlDeclaration(String text) {
        super(text);
        this.isXmlDeclaration = true;
    }

    public boolean isXmlDeclaration() {
        return isXmlDeclaration;
    }
}

public class CommentXmlDeclarationTest {

    @Test
    public void testCommentIsXmlDeclaration() {
        Document doc = Jsoup.parse("<xml_declaration>Some data</xml_declaration>");
        Element xmlDeclaration = doc.select("xml_declaration").first();
        assertTrue(xmlDeclaration.isXmlDeclaration());
    }

}