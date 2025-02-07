package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("This is a comment");
        assertEquals("Comment", comment.nodeName());
    }

}