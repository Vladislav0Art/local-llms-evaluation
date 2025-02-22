package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals("Test comment", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("Test comment");
        comment.setData("Updated comment");
        Assert.assertEquals("Updated comment", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        Assert.assertEquals("<!--Test comment-->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, Mockito.mock(Document.OutputSettings.class));
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void testToString() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals("<!--Test comment-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment comment = new Comment("Test comment");
        Comment clone = comment.clone();
        Assert.assertEquals(comment, clone);
    }

}