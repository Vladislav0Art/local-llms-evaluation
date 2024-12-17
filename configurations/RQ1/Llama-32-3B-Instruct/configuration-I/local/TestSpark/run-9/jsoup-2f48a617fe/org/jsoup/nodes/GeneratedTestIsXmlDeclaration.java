package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("!XML Declaration");
        assertTrue(comment.isXmlDeclaration());
        Comment comment2 = new Comment("?XML Declaration");
        assertTrue(comment2.isXmlDeclaration());
    }

}