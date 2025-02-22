package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test comment");
        assertNotNull(comment.outerHtmlHead(new StringBuilder(), 0, null));
    }

}