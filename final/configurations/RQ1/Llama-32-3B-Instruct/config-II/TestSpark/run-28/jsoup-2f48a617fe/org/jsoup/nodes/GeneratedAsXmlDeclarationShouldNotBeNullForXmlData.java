package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldNotBeNullForXmlData {

    @Test
    public void asXmlDeclarationShouldNotBeNullForXmlData() {
        Comment comment = new Comment("!xml version \"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}