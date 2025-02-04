package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsFalseForInvalidData {

    @Test
    public void isXmlDeclarationReturnsFalseForInvalidData() {
        Comment comment = new Comment("<!-- invalid data -->");
        assertFalse(comment.isXmlDeclaration());
    }

}