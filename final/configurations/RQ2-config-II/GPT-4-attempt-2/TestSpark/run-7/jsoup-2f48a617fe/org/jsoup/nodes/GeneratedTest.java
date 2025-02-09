package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void CommentDataTest() {
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
        Comment comment = new Comment("testData");
        String newData = "newData";
        comment.setData(newData);
        Assert.assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, depth, out);
        Assert.assertTrue(accum.toString().startsWith("<!--"));
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, depth, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("<!--testData-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment clone = comment.clone();
        Assert.assertEquals(clone.toString(), comment.toString());
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

}