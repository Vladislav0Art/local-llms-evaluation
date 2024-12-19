package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsFalse {

    @Test
    public void isXmlDeclarationReturnsFalse() {
        Comment comment = new Comment("This is not an XML declaration comment.");
        assertTrue(!comment.isXmlDeclaration());
    }

}