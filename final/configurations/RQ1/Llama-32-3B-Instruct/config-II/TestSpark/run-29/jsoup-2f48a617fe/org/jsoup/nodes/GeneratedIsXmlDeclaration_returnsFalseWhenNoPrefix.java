package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_returnsFalseWhenNoPrefix {

    @Test
    public void isXmlDeclaration_returnsFalseWhenNoPrefix() {
        Comment comment = new Comment("Data");
        assertFalse(comment.isXmlDeclaration());
    }

}