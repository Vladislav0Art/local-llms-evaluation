package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullWhenInnerElementsExist {

    @Test
    public void asXmlDeclarationReturnsNullWhenInnerElementsExist() {
        // given:
        Comment comment = new Comment("<?xml version=\"1.0\"?><html><body>Hello, World!</body></html>");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNull(decl);
    }

}