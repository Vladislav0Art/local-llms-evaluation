package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetDataTest {

    // test for Comment.nodeName()

    @Test
    public void setDataTest() throws Exception {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
        comment.setData("test1");
        assertEquals("test1", comment.getData());
    }

}