package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        try {
            comment.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("", accum.toString());
    }

}