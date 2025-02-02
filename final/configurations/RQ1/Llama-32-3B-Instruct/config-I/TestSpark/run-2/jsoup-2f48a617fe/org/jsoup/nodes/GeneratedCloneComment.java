package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneComment {

    @Test
    public void cloneComment() {
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            Comment clonedComment = comment.clone();
            assertNotNull(clonedComment);
            assertEquals(comment.getData(), clonedComment.getData());
        } catch (IOException e) {
            assert (false);
        }
    }

}