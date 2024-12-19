package org.jsoup.nodes;

public class GeneratedCloneCommentReturnsSameInstance {

    private static final String EMPTY_COMMENT = "<!-- -->";

    @Test
    public void cloneCommentReturnsSameInstance() {
        Comment comment = new Comment(EMPTY_COMMENT);
        Comment clonedComment = comment.clone();
        assertSame(comment, clonedComment);
    }

}