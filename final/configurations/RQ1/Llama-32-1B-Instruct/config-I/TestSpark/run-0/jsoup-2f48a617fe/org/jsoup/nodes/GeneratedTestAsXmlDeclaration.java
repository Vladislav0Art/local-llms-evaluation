package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("test content");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertEquals("<!xml version=\"1.0\" encoding=\"UTF-8\"?><!-- test content -->", xmlDecl.getContent());
    }

}