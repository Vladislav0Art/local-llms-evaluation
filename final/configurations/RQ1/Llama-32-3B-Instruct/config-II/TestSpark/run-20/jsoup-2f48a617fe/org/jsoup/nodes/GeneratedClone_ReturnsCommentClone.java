package org.jsoup.nodes;

public class GeneratedClone_ReturnsCommentClone {

    @Test
    public void clone_ReturnsCommentClone() {
        Comment comment = new Comment("Hello World");
        Comment result = comment.clone();
        assertNotNull(result);
        assert result == comment;
    }

}