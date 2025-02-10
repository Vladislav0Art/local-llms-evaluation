package org.jsoup.nodes;

public class GeneratedTestXmlDeclaration {

    @Test
    public void testXmlDeclaration() {
        String data = "<!DOCTYPE html><body>Comment</body></html>";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.isXmlDeclaration());
    }

}