package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullForInvalidXmlDeclarationData {

    @Test
    public void asXmlDeclarationReturnsNullForInvalidXmlDeclarationData() {
        Comment comment = new Comment("Not an XML declaration!");
        assertNull(comment.asXmlDeclaration());
    }

}