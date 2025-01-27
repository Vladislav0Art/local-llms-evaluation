package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullWhenCommentIsEmpty {

    private static final String TEST_DATA = "test data";

    @Test
    public void asXmlDeclarationReturnsNullWhenCommentIsEmpty() {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}