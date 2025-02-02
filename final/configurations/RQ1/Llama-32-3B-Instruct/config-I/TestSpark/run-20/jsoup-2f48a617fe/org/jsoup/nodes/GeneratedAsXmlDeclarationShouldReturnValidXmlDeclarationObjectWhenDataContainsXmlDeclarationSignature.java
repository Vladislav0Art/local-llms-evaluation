package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnValidXmlDeclarationObjectWhenDataContainsXmlDeclarationSignature {

    @Test
    public void asXmlDeclarationShouldReturnValidXmlDeclarationObjectWhenDataContainsXmlDeclarationSignature() {
        Comment comment = new Comment("<!-- !xml declaration -->");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}