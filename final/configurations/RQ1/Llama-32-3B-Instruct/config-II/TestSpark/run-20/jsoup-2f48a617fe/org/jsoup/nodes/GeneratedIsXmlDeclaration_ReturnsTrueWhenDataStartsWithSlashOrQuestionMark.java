package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsTrueWhenDataStartsWithSlashOrQuestionMark {

    @Test
    public void isXmlDeclaration_ReturnsTrueWhenDataStartsWithSlashOrQuestionMark() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
    }

}