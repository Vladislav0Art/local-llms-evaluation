package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsFalseForEmptyStringData {

    @Public

    @Test
    public void isXmlDeclarationReturnsFalseForEmptyStringData() {
        String data = "";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }

}