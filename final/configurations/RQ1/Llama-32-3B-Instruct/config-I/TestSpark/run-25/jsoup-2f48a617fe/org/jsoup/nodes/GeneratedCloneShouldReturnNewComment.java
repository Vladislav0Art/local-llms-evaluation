package org.jsoup.nodes;

public class GeneratedCloneShouldReturnNewComment {

    @Test
    public void cloneShouldReturnNewComment() {
        Comment comment = new Comment("Hello World");
        Comment clonedComment = comment.clone();
        assertNotSame(comment, clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

}