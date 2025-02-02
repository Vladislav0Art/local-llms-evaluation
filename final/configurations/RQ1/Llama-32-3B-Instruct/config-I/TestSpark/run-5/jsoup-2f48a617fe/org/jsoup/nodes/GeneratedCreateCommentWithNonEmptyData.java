package org.jsoup.nodes;

public class GeneratedCreateCommentWithNonEmptyData {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void createCommentWithNonEmptyData() {
        Comment comment = new Comment("This is a comment.");
        Assert.assertEquals(comment.getData(), "This is a comment.");
    }

}