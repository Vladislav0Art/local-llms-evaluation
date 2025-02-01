package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test comment");
        assertEquals("<!--test comment-->", comment.toString());
    }

}