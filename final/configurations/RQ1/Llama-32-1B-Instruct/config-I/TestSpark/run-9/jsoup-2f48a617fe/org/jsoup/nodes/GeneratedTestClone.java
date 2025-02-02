package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment originalComment = new Comment("Original comment");
        Comment clonedComment = (Comment) originalComment.clone();
        assertEquals(originalComment, clonedComment);
    }

}