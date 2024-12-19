package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullForInvalidData {

    @Test
    public void asXmlDeclarationReturnsNullForInvalidData() {
        // given:
        Comment comment = new Comment("Hello, World!");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNull(decl);
    }

}