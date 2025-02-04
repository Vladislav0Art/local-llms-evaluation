package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_returnsTrueWhenStartsWithQuestionMarkOrExclamationMark {

    @Test
    public void isXmlDeclaration_returnsTrueWhenStartsWithQuestionMarkOrExclamationMark() {
        Comment comment = new Comment("?Data");
        assertTrue(comment.isXmlDeclaration());
        Comment comment2 = new Comment("!Data");
        assertTrue(comment2.isXmlDeclaration());
    }

}