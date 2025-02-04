package org.jsoup.nodes;

public class GeneratedNewComment CreatesNewComment {

    @Test
    public void newComment

    CreatesNewComment() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a comment", comment.getData());
    }

}