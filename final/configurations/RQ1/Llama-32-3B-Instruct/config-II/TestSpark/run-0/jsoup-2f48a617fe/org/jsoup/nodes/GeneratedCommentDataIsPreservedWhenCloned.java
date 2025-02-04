package org.jsoup.nodes;

public class GeneratedCommentDataIsPreservedWhenCloned {

    @Test
    public void commentDataIsPreservedWhenCloned() {
        Comment originalComment = new Comment("Original Data");
        Comment clonedComment = originalComment.clone();
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

}