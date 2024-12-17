package org.jsoup.nodes;

public class GeneratedTestXmlDeclarationIsNullAfterRemoving {

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
    public void testXmlDeclarationIsNullAfterRemoving() {
        Document doc = Jsoup.parse("<comment>Some data</comment>");
        Element comment = doc.select("comment").first();
        Comment c = new Comment(comment.toString());
        comment.unwrap();
        assertTrue(c.isXmlDeclaration());
    }

}