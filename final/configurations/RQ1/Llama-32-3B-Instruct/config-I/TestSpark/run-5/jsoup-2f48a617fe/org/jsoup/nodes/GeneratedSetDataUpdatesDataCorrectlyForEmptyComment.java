package org.jsoup.nodes;

public class GeneratedSetDataUpdatesDataCorrectlyForEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void setDataUpdatesDataCorrectlyForEmptyComment() {
        Comment comment = new Comment(EMPTY_COMMENT);
        comment.setData("New data");
        Assert.assertEquals(comment.getData(), "New data");
    }

}