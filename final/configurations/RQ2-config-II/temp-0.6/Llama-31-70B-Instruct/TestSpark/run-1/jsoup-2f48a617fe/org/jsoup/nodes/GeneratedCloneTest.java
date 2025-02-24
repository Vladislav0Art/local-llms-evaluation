package org.jsoup.nodes;

public class GeneratedCloneTest {

    private Comment comment;

    @Test
    public void cloneTest() {
        comment = new Comment("data");
        Comment clone = comment.clone();
        assertNotNull(clone);
        assertNotSame(comment, clone);
        assertEquals("data", clone.getData());
    }

}