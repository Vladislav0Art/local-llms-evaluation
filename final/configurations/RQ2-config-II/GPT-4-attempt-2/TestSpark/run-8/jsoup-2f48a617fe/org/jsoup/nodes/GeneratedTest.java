package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void CommentDataConstructorTest() {
        String data = "testData";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void setDataTest() {
        String data = "newData";
        Comment comment = new Comment("testData");
        Comment newDataComment = comment.setData(data);
        Assert.assertEquals(data, newDataComment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("<!--testData-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment cloneComment = comment.clone();
        Assert.assertEquals("testData", cloneComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("testData");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("testData");
        Assert.assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("<!--testData-->", comment.toString());
    }

}