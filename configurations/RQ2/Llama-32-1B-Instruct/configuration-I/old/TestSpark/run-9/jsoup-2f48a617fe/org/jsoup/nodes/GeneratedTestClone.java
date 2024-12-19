package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("This is a sample comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}