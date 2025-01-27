package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedNodeName ReturnsCommentForCommentNode {

    @Test
    public void nodeName

    ReturnsCommentForCommentNode() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}