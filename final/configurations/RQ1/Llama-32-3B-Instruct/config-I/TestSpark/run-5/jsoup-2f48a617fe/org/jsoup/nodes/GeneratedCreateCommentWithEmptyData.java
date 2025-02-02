package org.jsoup.nodes;

public class GeneratedCreateCommentWithEmptyData {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void createCommentWithEmptyData() {
        Assert.assertTrue(Comment.isEmpty(EMPTY_COMMENT));
    }

}