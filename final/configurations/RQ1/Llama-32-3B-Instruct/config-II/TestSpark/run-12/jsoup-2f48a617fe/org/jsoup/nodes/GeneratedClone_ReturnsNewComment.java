package org.jsoup.nodes;

public class GeneratedClone_ReturnsNewComment {

    @Test
    public void clone_ReturnsNewComment() {
        // given
        Comment comment = new Comment("This is a comment");

        // when
        Comment clonedComment = comment.clone();

        // then
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

}