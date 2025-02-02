package org.jsoup.nodes;

public class GeneratedCloneCreatesNewCommentWithSameData {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void cloneCreatesNewCommentWithSameData() {
        Comment comment = new Comment("This is a comment.");
        Comment cloned = comment.clone();
        Assert.assertEquals(comment.getData(), cloned.getData());
    }
}

}