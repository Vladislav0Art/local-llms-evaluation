package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsFalseForNormalComments {

    @Test
    public void IsXmlDeclaration_ReturnsFalseForNormalComments() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}