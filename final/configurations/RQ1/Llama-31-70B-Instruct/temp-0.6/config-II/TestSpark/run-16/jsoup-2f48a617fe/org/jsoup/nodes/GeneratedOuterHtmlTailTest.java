package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("comment");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, null);
        assertEquals("", builder.toString());
    }

}