package org.jsoup.nodes;

public class GeneratedCommentConstructor_ReturnsCommentWithCorrectData {

    @Test
    public void commentConstructor_ReturnsCommentWithCorrectData() {
        Comment comment = new Comment("Some data");
        assertEquals("Some data", comment.getData());
    }

}