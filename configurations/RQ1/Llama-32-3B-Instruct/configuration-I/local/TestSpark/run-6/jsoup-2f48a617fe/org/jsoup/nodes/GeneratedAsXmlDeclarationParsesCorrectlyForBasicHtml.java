package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationParsesCorrectlyForBasicHtml {

    @Public

    @Test
    public void asXmlDeclarationParsesCorrectlyForBasicHtml() throws Exception {
        String data = "<!DOCTYPE html>";
        Comment comment = new Comment(data);
        XmlDeclaration decl = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("html", decl.getTagName());
    }

}