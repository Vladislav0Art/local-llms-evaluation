package org.jsoup.nodes;

public class GeneratedTestIsNotXmlDeclaration {

    @Test
    public void testIsNotXmlDeclaration() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

}