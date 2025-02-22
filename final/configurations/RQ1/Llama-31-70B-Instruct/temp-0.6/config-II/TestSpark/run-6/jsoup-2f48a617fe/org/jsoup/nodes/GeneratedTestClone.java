package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("Test comment");
        Comment clonedComment = comment.clone();
        assertTrue(comment.equals(clonedComment));
    }

}