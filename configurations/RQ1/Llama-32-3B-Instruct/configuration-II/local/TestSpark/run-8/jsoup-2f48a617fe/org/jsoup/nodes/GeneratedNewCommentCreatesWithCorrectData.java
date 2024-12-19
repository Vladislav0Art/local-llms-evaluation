package org.jsoup.nodes;

public class GeneratedNewCommentCreatesWithCorrectData {

    @Test
    public void newCommentCreatesWithCorrectData() {
        Comment comment = new Comment("This is a test comment.");
        assertEquals(comment.getData(), "This is a test comment.");
    }

}