package org.jsoup.nodes;

public class GeneratedCloneCommentTest {

    @Test
    public void cloneCommentTest() {
        Comment original = new Comment("Hello World!");
        Comment cloned = original.clone();
        assertEquals(original.nodeName(), cloned.nodeName());
        assertEquals(original.getData(), cloned.getData());
    }

}