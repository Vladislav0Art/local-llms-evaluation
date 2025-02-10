package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        String data = "#!hello world";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertTrue(decl != null);
        assertNotNull(decl.content());
    }

}