package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("updated-test");
        Assert.assertEquals("updated-test", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuffer testBuffer = new StringBuffer();
        Comment comment = new Comment("test");
        comment.outerHtmlHead(testBuffer, 0, new Document.OutputSettings());
        Assert.assertTrue(testBuffer.length() > 0);
    }

    @Test
    public void outerHtmlTailTest() {
        StringBuffer testBuffer = new StringBuffer();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(testBuffer, 0, new Document.OutputSettings());
        Assert.assertTrue(testBuffer.length() > 0);
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("test", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Assert.assertNotSame(comment, comment.clone());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}