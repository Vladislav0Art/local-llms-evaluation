package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnFalseForCommentsWithoutData {

    @Test
    public void isXmlDeclarationShouldReturnFalseForCommentsWithoutData() {
        String data = "This is not an XML declaration";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }

}