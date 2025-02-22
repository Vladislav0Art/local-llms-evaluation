package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("comment");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlHead(builder, 0, null);
        assertEquals("<!--comment-->", builder.toString());
    }

}