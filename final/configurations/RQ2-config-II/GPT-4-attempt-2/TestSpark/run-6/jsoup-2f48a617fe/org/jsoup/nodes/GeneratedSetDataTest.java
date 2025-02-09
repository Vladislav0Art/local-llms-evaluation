package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test comment");
        Comment commentUpdated = comment.setData("updated comment");
        assertEquals("updated comment", commentUpdated.getData());
    }

}