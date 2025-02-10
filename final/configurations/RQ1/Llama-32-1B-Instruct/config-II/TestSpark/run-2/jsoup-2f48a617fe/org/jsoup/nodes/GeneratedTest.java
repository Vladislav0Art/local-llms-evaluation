package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testXmlDeclaration() {
        String data = "<!DOCTYPE html><body>Comment</body></html>";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testXmlDeclarationNotXmlDeclarationData() {
        String data = "<!DOCTYPE html><body>Comment</body>";
        Comment comment = new Comment(data);
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        String data = "Comment";
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        AssertNotNull(xmlDecl);
    }

}