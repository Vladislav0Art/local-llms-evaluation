package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneCreatesNewCommentWithSameData {

    @Test
    public void cloneCreatesNewCommentWithSameData() {
        Comment comment = new Comment("Hello World");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}