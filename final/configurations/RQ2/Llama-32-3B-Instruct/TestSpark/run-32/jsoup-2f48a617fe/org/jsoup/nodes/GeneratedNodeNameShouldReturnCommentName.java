package org.jsoup.nodes;

public class GeneratedNodeNameShouldReturnCommentName {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void nodeNameShouldReturnCommentName() {
        Comment comment = new Comment(COMMENT_DATA);
        assertEquals("comment", comment.nodeName());
    }

}