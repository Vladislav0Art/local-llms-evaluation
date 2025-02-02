package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationTest_withValidDeclaration {

    @Test
    public void asXmlDeclarationTest_withValidDeclaration() {
        Comment comment = new Comment("<!-- This is an XML Declaration -->");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}