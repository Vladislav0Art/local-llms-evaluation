package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsFalseForEmptyString {

    @Test
    public void isXmlDeclaration_ReturnsFalseForEmptyString() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}