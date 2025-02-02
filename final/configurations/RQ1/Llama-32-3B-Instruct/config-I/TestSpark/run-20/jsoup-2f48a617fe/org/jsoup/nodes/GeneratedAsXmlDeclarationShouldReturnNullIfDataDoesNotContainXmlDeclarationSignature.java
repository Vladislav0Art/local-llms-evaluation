package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnNullIfDataDoesNotContainXmlDeclarationSignature {

    @Test
    public void asXmlDeclarationShouldReturnNullIfDataDoesNotContainXmlDeclarationSignature() {
        Comment comment = new Comment("<!-- bogus data -->");
        assertNull(comment.asXmlDeclaration());
    }

}