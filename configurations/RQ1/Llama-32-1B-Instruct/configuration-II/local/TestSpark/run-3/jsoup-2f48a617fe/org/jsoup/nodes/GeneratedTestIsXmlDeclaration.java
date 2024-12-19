package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String data = "!xml-declaration";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
        assertEquals(true, comment.asXmlDeclaration().isPresent());
    }

}