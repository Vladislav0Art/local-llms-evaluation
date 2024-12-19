package org.jsoup.nodes;

public class GeneratedCreateCommentWithDataIsNotNull {

    @Test
    public void createCommentWithDataIsNotNull() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertNotNull(comment);
    }

}