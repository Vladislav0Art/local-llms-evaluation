package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, null);
        assertEquals("<!--test-->", accum.toString());
    }

}