package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationWithStartsWithSlashIsTrue {

    @Test
    public void isXmlDeclarationWithStartsWithSlashIsTrue() {
        // given:
        Comment comment = new Comment("!Hello, World!");

        // when:
        boolean isDeclaration = comment.isXmlDeclaration();

        // verify:
        assertTrue(isDeclaration);
    }

}