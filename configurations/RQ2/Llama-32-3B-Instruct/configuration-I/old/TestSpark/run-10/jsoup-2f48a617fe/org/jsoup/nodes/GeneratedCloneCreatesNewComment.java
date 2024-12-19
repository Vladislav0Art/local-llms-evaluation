package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedCloneCreatesNewComment {

    @Test
    public void cloneCreatesNewComment() {
        Comment originalComment = new Comment("Some comment");
        Comment clonedComment = originalComment.clone();
        assertNotSame(originalComment, clonedComment);
    }

}