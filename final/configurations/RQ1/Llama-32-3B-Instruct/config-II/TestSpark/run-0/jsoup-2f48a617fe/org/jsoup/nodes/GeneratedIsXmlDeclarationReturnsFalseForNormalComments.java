package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsFalseForNormalComments {

    @Test
    public void isXmlDeclarationReturnsFalseForNormalComments() {
        Comment comment = new Comment("Normal Data");
        assertFalse(comment.isXmlDeclaration());
    }

}