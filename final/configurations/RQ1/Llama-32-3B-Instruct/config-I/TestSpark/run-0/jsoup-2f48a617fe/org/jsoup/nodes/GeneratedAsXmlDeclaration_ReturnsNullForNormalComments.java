package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_ReturnsNullForNormalComments {

    @Test
    public void AsXmlDeclaration_ReturnsNullForNormalComments() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}