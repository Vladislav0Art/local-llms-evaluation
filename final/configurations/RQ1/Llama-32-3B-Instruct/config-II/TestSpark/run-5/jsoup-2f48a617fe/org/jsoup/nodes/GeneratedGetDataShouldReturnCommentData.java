package org.jsoup.nodes;

public class GeneratedGetDataShouldReturnCommentData {

    private Comment comment;

    @Test
    public void getDataShouldReturnCommentData() {
        comment = new Comment("This is a test comment");
        assertEquals("This is a test comment", comment.getData());
    }

}