package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullAndIsNot-

nullWhenCommentIsEmpty {

    private static final String TEST_DATA = "test data";

    @Test
    public void asXmlDeclarationReturnsNullAndIsNot -nullWhenCommentIsEmpty() {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertNull(xmlDeclaration.getContents());
    }

}