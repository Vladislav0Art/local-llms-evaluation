package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

}