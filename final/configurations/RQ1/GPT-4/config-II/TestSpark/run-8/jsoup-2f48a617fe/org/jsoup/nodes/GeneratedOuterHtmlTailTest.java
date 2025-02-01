package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();

        try {
            comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        } catch (IOException e) {
            fail();
        }

        assertEquals("", accum.toString());
    }

}