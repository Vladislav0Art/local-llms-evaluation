package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_returnsNullWhenNoPrefix {

    @Test
    public void asXmlDeclaration_returnsNullWhenNoPrefix() {
        Comment comment = new Comment("Data");
        assertNull(comment.asXmlDeclaration());
    }

}