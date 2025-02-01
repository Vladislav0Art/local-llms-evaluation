package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test comment");
        assertEquals("test comment", comment.getData());
    }

}