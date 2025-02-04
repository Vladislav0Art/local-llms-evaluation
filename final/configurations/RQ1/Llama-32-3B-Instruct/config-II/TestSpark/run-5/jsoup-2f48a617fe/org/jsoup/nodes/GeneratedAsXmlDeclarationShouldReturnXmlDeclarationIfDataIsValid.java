package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnXmlDeclarationIfDataIsValid {

    private Comment comment;

    @Test
    public void asXmlDeclarationShouldReturnXmlDeclarationIfDataIsValid() throws IOException {
        comment = new Comment("<xml version=\"1.0\" encoding=\"UTF-8«>");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals("xml", xmlDecl.tag());
        assertTrue(xmlDecl.attributes().containsKey("version"));
    }

}