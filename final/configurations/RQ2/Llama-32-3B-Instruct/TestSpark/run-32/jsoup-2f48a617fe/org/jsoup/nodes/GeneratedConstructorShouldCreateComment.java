package org.jsoup.nodes;

public class GeneratedConstructorShouldCreateComment {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void constructorShouldCreateComment() {
        Comment comment = new Comment(COMMENT_DATA);
        assertEquals(COMMENT_DATA, comment.getData());
    }

}