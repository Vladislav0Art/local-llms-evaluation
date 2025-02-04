package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsTrueForValidData {

    @Test
    public void isXmlDeclarationReturnsTrueForValidData() {
        Comment comment = new Comment("<!DOCTYPE html>");
        assertTrue(comment.isXmlDeclaration());
    }

}