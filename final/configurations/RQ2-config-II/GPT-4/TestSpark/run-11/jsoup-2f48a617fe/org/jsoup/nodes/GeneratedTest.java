package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test Comment");
        Assert.assertEquals("Test Comment", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test Comment");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test Data");
        Assert.assertEquals("Test Data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("New Data");
        Assert.assertEquals("New Data", comment.getData());
    }

    @Test
    public void tostringTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.toString().contains(data));
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Comment");
        Comment cloneComment = comment.clone();
        Assert.assertEquals(comment.getData(), cloneComment.getData());
    }

    @Test
    public void isXmlDeclarationTestForFalseScenario() {
        Comment comment = new Comment("Test Comment");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTestForTrueScenario() {
        Comment comment = new Comment("<?Test Comment?>");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationValidDataTest() {
        Comment comment = new Comment("<?Test Comment?>");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationInvalidDataTest() {
        Comment comment = new Comment("Test Comment");
        Assert.assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHeadValidScenario() throws IOException {
        Comment comment = new Comment("Test Comment");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("Test Comment"));
    }

    @Test
    public void outerHtmlTailValidScenario() throws IOException {
        Comment comment = new Comment("Test Comment");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}