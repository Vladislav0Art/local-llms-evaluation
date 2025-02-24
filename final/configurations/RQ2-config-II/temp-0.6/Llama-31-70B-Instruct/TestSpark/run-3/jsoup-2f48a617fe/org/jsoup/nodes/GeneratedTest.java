package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        String expected = "comment";
        String actual = new Comment("comment").nodeName();
        assertEquals(expected, actual);
    }

    @Test
    public void getDataTest() {
        String expected = "data";
        String actual = new Comment("data").getData();
        assertEquals(expected, actual);
    }

    @Test
    public void setDataTest() {
        String expected = "new data";
        String actual = new Comment("data").setData("new data").getData();
        assertEquals(expected, actual);
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("comment");
        try {
            comment.outerHtmlHead(null, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("comment");
        try {
            comment.outerHtmlTail(null, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void toStringTest() {
        String expected = "Comment[comment]";
        String actual = new Comment("comment").toString();
        assertEquals(expected, actual);
    }

}