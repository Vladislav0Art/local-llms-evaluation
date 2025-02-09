package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("test comment");
        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test node");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test data");
        Assert.assertEquals("test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("new data");
        Assert.assertEquals("new data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test head");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertNotEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test tail");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test toString");
        Assert.assertEquals("<!--test toString-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test clone");
        Comment clonedNode = comment.clone();
        Assert.assertEquals(comment.getData(), clonedNode.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("XML declaration");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("XML declaration");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}