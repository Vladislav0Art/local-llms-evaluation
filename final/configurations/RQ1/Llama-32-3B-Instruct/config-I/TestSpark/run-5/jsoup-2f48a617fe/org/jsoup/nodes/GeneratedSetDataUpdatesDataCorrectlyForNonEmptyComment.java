package org.jsoup.nodes;

public class GeneratedSetDataUpdatesDataCorrectlyForNonEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void setDataUpdatesDataCorrectlyForNonEmptyComment() {
        Comment comment = new Comment("This is a comment.");
        comment.setData("New data");
        Assert.assertEquals(comment.getData(), "New data");
    }

}