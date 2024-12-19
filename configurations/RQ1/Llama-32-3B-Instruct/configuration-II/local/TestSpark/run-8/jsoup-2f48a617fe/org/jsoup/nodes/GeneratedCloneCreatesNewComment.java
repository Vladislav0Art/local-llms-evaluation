package org.jsoup.nodes;

public class GeneratedCloneCreatesNewComment {

    @Test
    public void cloneCreatesNewComment() {
        Comment comment = new Comment("This is a test comment.");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}