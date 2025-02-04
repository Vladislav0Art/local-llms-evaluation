package org.jsoup.nodes;

public class GeneratedCloneShouldReturnSameCommentNode {

    @Test
    public void cloneShouldReturnSameCommentNode() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}