package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnFalseForCommentWithoutData {

    @Test
    public void isXmlDeclarationShouldReturnFalseForCommentWithoutData() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}