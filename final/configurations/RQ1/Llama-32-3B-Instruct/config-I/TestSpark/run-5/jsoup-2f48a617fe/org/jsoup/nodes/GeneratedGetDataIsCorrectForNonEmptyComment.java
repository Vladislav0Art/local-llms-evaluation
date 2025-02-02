package org.jsoup.nodes;

public class GeneratedGetDataIsCorrectForNonEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void getDataIsCorrectForNonEmptyComment() {
        Comment comment = new Comment("This is a comment.");
        Assert.assertEquals(comment.getData(), "This is a comment.");
    }

}