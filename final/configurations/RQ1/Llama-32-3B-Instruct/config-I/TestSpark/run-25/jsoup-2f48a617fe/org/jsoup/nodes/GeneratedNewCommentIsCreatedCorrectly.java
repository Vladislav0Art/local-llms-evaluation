package org.jsoup.nodes;

public class GeneratedNewCommentIsCreatedCorrectly {

    @Test
    public void newCommentIsCreatedCorrectly() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}