package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        String data = "<!xml-declaration>";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(!decl.isEmpty());
    }

}