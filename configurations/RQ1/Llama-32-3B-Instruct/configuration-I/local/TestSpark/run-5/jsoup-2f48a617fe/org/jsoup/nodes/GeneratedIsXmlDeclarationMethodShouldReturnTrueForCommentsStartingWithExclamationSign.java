package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationMethodShouldReturnTrueForCommentsStartingWithExclamationSign {

    @Test
    public void isXmlDeclarationMethodShouldReturnTrueForCommentsStartingWithExclamationSign() {
        Comment comment = new Comment("!This is a test");
        assertTrue(comment.isXmlDeclaration());
    }

}