package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("comment");
        assertEquals("comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("comment");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlHead(builder, 0, null);
        assertEquals("<!--comment-->", builder.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("comment");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, null);
        assertEquals("", builder.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("comment");
        assertEquals("<!--comment-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("comment");
        Comment clone = comment.clone();
        assertEquals("comment", clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("comment");
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("comment");
        assertEquals(null, comment.asXmlDeclaration());
    }

}