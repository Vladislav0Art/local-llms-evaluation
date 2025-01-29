package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("This is a sample comment.");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

}