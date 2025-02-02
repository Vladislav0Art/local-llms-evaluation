package org.jsoup.nodes;

public class GeneratedCommentConstruction_ChecksThatTheCommentConstructorWorksCorrectly {

    @Test
    public void CommentConstruction_ChecksThatTheCommentConstructorWorksCorrectly() {
        Comment comment = new Comment("This is a test comment");
        assertEquals("This is a test comment", comment.getData());
    }

}