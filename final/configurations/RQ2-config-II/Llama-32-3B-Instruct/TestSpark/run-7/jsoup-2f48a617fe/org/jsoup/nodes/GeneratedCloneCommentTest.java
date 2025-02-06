package org.jsoup.nodes;

public class GeneratedCloneCommentTest {

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment.getData(), cloned.getData());
    }

}