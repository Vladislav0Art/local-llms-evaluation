package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnTrueWhenCommentDataIs XmlDeclaration {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void isXmlDeclarationShouldReturnTrueWhenCommentDataIs

    XmlDeclaration() {
        Comment comment = new Comment("<xml>Declaration</xml>");
        assertTrue(comment.isXmlDeclaration());
    }

}