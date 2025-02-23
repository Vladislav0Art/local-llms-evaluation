package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedOuterHtmlTailTest {

    // test for Comment.nodeName()

    @Test
    public void outerHtmlTailTest() throws Exception {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, comment.ownerDocument().outputSettings());
        assertEquals("", accum.toString());
    }

}