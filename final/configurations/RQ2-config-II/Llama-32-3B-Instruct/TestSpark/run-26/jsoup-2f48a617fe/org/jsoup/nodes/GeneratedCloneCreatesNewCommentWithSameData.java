package org.jsoup.nodes;

public class GeneratedCloneCreatesNewCommentWithSameData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void cloneCreatesNewCommentWithSameData() {
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}