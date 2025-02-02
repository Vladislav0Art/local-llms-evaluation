package org.jsoup.nodes;

public class GeneratedCloneCommentTest {

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("Hello World!");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals("#comment", cloned.nodeName());
        assertEquals(comment.getData(), cloned.getData());
    }

}