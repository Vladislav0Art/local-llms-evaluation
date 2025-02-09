package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnFalseWhenCommentDataIsNotXmlDeclaration {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void isXmlDeclarationShouldReturnFalseWhenCommentDataIsNotXmlDeclaration() {
        Comment comment = new Comment(COMMENT_DATA);
        assertFalse(comment.isXmlDeclaration());
    }

}