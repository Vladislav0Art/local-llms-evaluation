package org.jsoup.nodes;

public class GeneratedClone_ReturnsNewCommentWithSameData {

    @Test
    public void clone_ReturnsNewCommentWithSameData() {
        Comment comment = new Comment("Some data");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals("Some data", cloned.getData());
    }

}