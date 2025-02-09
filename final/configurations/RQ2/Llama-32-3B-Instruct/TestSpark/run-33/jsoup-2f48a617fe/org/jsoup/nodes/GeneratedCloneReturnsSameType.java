package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.LeafNode;

public class GeneratedCloneReturnsSameType {

    @Test
    public void cloneReturnsSameType() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertSame(Comment.class, cloned.getClass());
    }

}