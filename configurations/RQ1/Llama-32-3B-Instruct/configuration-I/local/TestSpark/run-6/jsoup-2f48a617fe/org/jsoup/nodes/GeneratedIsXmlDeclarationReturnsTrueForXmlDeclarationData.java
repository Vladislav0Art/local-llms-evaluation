package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsTrueForXmlDeclarationData {

    @Public

    @Test
    public void isXmlDeclarationReturnsTrueForXmlDeclarationData() {
        String data = "!DOCTYPE html";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}