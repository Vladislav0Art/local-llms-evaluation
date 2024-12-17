package org.jsoup.nodes;

public class GeneratedCloneCommentReturnsTheSameObject {

    @Public

    @Test
    public void cloneCommentReturnsTheSameObject() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertSame(comment, clonedComment);
    }

}