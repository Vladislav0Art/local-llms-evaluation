package org.jsoup.nodes;

public class GeneratedCreateCommentFromDataShouldReturnValidComment {

    @Test
    public void createCommentFromDataShouldReturnValidComment() {
        Comment comment = new Comment("<!-- data -->");
        assertEquals("#comment", comment.nodeName());
        assertEquals("data", comment.getData());
    }

}