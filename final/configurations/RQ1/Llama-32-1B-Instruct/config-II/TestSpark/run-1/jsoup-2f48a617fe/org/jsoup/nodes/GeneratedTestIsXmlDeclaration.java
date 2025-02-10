package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String data = "#!hello world";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}