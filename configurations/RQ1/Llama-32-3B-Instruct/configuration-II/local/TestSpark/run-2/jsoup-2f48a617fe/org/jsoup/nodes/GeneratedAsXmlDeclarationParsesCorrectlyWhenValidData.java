package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationParsesCorrectlyWhenValidData {

    @Test
    public void asXmlDeclarationParsesCorrectlyWhenValidData() {
        // given:
        Comment comment = new Comment("<?xml version=\"1.0\"?><hello world/>");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNotNull(decl);
        assertEquals("hello", decl.tagName());
    }

}