package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullForInvalidData {

    @Test
    public void asXmlDeclarationReturnsNullForInvalidData() {
        Comment comment = new Comment("<!DOCTYPE html>");
        assertNull(comment.asXmlDeclaration());
    }

}