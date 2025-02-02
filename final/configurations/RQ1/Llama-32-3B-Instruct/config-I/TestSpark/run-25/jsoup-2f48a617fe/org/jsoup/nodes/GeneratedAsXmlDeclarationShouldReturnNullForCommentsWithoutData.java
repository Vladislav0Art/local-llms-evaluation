package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnNullForCommentsWithoutData {

    @Test
    public void asXmlDeclarationShouldReturnNullForCommentsWithoutData() {
        Comment comment = new Comment("This is not an XML declaration");
        assertNull(comment.asXmlDeclaration());
    }

}