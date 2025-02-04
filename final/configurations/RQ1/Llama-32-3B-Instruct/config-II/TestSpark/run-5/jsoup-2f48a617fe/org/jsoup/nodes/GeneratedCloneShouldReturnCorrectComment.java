package org.jsoup.nodes;

public class GeneratedCloneShouldReturnCorrectComment {

    private Comment comment;

    @Test
    public void cloneShouldReturnCorrectComment() {
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.nodeName(), clonedComment.nodeName());
    }

}