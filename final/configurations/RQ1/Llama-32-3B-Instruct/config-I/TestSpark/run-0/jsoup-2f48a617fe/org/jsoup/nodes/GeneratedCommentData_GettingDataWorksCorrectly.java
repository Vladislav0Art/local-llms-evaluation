package org.jsoup.nodes;

public class GeneratedCommentData_GettingDataWorksCorrectly {

    @Test
    public void CommentData_GettingDataWorksCorrectly() {
        Comment comment = new Comment("This is a test comment");
        assertNotNull(comment.getData());
        assertTrue(comment.getData().contains("This"));
        assertFalse(comment.getData().contains("is"));
    }

}