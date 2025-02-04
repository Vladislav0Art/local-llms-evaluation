package org.jsoup.nodes;

public class GeneratedCloneReturnsCorrectComment {

    @Test
    public void cloneReturnsCorrectComment() {
        Comment comment = new Comment("<!-- comment -->");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

}