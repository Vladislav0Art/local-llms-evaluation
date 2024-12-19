package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationParsesCorrectlyWhenValidDataWithNamespace {

    @Test
    public void asXmlDeclarationParsesCorrectlyWhenValidDataWithNamespace() {
        // given:
        Comment comment = new Comment("<:hello world:/>");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNotNull(decl);
        assertEquals("hello", decl.tagName());
    }

}