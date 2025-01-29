package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedCloneCreates clonesComment {

    @Test
    public void cloneCreates

    clonesComment() throws IOException {
        String commentData = "new test data";
        Comment comment = new Comment(commentData);
        Comment clonedComment = comment.clone();
        assertEquals(commentData, clonedComment.getData());
    }

}