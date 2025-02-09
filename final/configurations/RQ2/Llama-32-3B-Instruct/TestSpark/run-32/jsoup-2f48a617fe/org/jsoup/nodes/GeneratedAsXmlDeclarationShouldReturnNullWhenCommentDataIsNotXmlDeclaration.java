package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnNullWhenCommentDataIsNotXmlDeclaration {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void asXmlDeclarationShouldReturnNullWhenCommentDataIsNotXmlDeclaration() {
        Comment comment = new Comment(COMMENT_DATA);
        assertNull(comment.asXmlDeclaration());
    }

}