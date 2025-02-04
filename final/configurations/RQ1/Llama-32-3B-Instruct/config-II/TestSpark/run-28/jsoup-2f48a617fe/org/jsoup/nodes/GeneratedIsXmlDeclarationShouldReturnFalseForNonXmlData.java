package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnFalseForNonXmlData {

    @Test
    public void isXmlDeclarationShouldReturnFalseForNonXmlData() {
        Comment comment = new Comment("not xml");
        assertFalse(comment.isXmlDeclaration());
    }

}