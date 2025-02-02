package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("!xml declaration");
        assertTrue(comment.isXmlDeclaration());
    }

}