package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationIsFalse {

    @Test
    public void isXmlDeclarationIsFalse() {
        // given:
        Comment comment = new Comment("Hello, World!");

        // when:
        boolean isDeclaration = comment.isXmlDeclaration();

        // verify:
        assertFalse(isDeclaration);
    }

}