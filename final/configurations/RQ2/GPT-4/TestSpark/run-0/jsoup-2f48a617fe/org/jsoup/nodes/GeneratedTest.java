package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("<!--data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("<!--data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment commentClone = comment.clone();
        Assert.assertNotSame(comment, commentClone);
        Assert.assertEquals(comment.getData(), commentClone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("data");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}