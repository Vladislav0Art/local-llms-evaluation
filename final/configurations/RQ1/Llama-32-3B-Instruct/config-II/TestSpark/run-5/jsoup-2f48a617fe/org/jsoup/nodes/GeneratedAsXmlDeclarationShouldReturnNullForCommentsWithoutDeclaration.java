package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnNullForCommentsWithoutDeclaration {

    private Comment comment;

    @Test
    public void asXmlDeclarationShouldReturnNullForCommentsWithoutDeclaration() {
        comment = new Comment("This is a test comment without declaration");
        assertNull(comment.asXmlDeclaration());
    }

}