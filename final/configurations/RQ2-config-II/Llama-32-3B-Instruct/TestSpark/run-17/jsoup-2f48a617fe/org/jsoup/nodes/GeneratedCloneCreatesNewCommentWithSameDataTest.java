package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedCloneCreatesNewCommentWithSameDataTest {

    @Test
    public void cloneCreatesNewCommentWithSameDataTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}