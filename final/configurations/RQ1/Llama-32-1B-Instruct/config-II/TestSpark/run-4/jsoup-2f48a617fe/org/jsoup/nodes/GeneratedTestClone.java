package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        String data = "This is a comment";
        Comment originalComment = new Comment(data);
        Comment clonedComment = originalComment.clone();
        assertEquals(originalComment, clonedComment);
    }

}