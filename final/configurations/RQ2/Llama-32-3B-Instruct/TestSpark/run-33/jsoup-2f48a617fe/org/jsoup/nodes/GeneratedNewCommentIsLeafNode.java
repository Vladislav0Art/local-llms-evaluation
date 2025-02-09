package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.LeafNode;

public class GeneratedNewCommentIsLeafNode {

    @Test
    public void newCommentIsLeafNode() {
        Comment comment = new Comment("data");
        assertSame(LeafNode.class, comment.getClass());
    }

}