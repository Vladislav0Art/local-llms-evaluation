package org.jsoup.nodes;

public class GeneratedCloneMethodShouldReturnNewCommentNode {

    @Test
    public void cloneMethodShouldReturnNewCommentNode() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

}