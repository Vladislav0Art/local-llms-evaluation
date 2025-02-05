package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test data");

        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test data");

        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test data");

        Assert.assertEquals("Test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test data");
        comment.setData("New test data");

        Assert.assertEquals("New test data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlHead(accum, 0, out);

        Assert.assertTrue(accum.toString().contains("<!--Test data-->"));
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlTail(accum, 0, out);

        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test data");

        Assert.assertTrue(comment.toString().contains("<!--Test data-->"));
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment clonedComment = comment.clone();

        Assert.assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test data");

        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test data");

        Assert.assertNull(comment.asXmlDeclaration());
    }

}