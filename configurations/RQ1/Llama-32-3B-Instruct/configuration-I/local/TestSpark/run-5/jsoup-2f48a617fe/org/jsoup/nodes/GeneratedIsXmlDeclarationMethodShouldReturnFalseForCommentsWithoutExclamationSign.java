package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationMethodShouldReturnFalseForCommentsWithoutExclamationSign {

    @Test
    public void isXmlDeclarationMethodShouldReturnFalseForCommentsWithoutExclamationSign() {
        Comment comment = new Comment("This is a test");
        assertFalse(comment.isXmlDeclaration());
    }

}