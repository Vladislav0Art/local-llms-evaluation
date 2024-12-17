package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullWhenNotAnXmlDeclaration {

    @Public

    @Test
    public void asXmlDeclarationReturnsNullWhenNotAnXmlDeclaration() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }

}