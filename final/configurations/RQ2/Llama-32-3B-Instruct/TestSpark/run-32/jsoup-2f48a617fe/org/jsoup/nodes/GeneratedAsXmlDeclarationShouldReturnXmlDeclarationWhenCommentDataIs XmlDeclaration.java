package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnXmlDeclarationWhenCommentDataIs XmlDeclaration {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void asXmlDeclarationShouldReturnXmlDeclarationWhenCommentDataIs

    XmlDeclaration() {
        Comment comment = new Comment("<xml>Declaration</xml>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration != null && xmlDeclaration.length() > 0);
    }

}