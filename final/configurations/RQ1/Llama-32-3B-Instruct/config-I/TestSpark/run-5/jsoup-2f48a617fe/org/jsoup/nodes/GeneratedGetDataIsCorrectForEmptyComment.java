package org.jsoup.nodes;

public class GeneratedGetDataIsCorrectForEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void getDataIsCorrectForEmptyComment() {
        Comment comment = new Comment(EMPTY_COMMENT);
        Assert.assertTrue(comment.getData().isEmpty());
    }

}