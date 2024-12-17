package org.jsoup.nodes;

public class GeneratedNewCommentCreatesNewNodeWithCorrectData {

    @Test
    public void newCommentCreatesNewNodeWithCorrectData() {
        Comment comment = new Comment("This is a test");
        assertEquals("This is a test", comment.getData());
    }

}