package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    // test for Comment.nodeName()

    @Test
    public void nodeNameTest() throws Exception {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() throws Exception {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() throws Exception {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
        comment.setData("test1");
        assertEquals("test1", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, comment.ownerDocument().outputSettings());
        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws Exception {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, comment.ownerDocument().outputSettings());
        assertEquals("", accum.toString());
    }

}