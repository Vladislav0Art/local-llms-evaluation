package org.jsoup.nodes;

public class GeneratedNewCommentIsCreatedCorrectly {

    @Public

    @Test
    public void newCommentIsCreatedCorrectly() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}