package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsFalseWhenDataDoesNotStartWithSlashOrQuestionMark {

    @Test
    public void isXmlDeclaration_ReturnsFalseWhenDataDoesNotStartWithSlashOrQuestionMark() {
        Comment comment = new Comment("Hello World");
        assertFalse(comment.isXmlDeclaration());
    }

}