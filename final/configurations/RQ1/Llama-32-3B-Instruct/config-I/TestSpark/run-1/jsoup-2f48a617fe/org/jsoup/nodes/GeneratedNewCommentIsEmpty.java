package org.jsoup.nodes;

public class GeneratedNewCommentIsEmpty {

    @Test
    public void newCommentIsEmpty() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}