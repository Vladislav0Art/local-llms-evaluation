package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void commentTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void commentNullTest() {
        Comment comment = new Comment(null);
        assertEquals("", comment.getData());
    }

    @Test
    public void commentEmptyTest() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void commentSetDataTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

    @Test
    public void commentSetDataNullTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData(null);
        assertEquals("", comment.getData());
    }

    @Test
    public void commentSetDataEmptyTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData("");
        assertEquals("", comment.getData());
    }

}