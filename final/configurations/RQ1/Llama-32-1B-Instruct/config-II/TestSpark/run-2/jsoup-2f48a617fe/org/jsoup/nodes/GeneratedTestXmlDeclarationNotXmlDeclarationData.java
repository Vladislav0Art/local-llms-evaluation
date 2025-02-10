package org.jsoup.nodes;

public class GeneratedTestXmlDeclarationNotXmlDeclarationData {

    @Test
    public void testXmlDeclarationNotXmlDeclarationData() {
        String data = "<!DOCTYPE html><body>Comment</body>";
        Comment comment = new Comment(data);
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}