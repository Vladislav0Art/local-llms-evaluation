package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsTrueForXmlDeclarationData {

    @Test
    public void isXmlDeclarationReturnsTrueForXmlDeclarationData() {
        Comment comment = new Comment("?!xml version=\"1.0\"");
        assertTrue(comment.isXmlDeclaration());
    }

}