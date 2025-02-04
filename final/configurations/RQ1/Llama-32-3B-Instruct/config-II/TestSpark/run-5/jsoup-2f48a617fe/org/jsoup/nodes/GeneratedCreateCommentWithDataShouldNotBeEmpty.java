package org.jsoup.nodes;

public class GeneratedCreateCommentWithDataShouldNotBeEmpty {

    private Comment comment;

    @Test
    public void createCommentWithDataShouldNotBeEmpty() {
        comment = new Comment("This is a test comment");
        assertEquals(!comment.getData().isEmpty(), true);
    }

}