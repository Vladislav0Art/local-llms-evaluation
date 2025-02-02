package org.jsoup.nodes;

public class GeneratedTestXmlDeclaration {

    @Test
    public void testXmlDeclaration() {
        Comment comment = new Comment("xml_declaration", "<!-- xml_declaration -->");
        assertTrue(comment.isXmlDeclaration());
        assertNull(comment.asXmlDeclaration());
    }

}