package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsValidXMLDeclarationForCorrectData {

    @Test
    public void asXmlDeclarationReturnsValidXMLDeclarationForCorrectData() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.isXmlDeclaration());
    }

}