package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();

        try {
            comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        } catch (IOException e) {
            fail();
        }

        assertEquals("<!--test-->", accum.toString());
    }

}