package org.jsoup.nodes;

public class GeneratedClone {

    @Test
    public void clone() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
    }

}