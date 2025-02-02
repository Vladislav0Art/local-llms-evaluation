package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationTest_withoutValidDeclaration {

    @Test
    public void asXmlDeclarationTest_withoutValidDeclaration() {
        Comment comment = new Comment("<!-- This is not an XML Declaration -->");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}