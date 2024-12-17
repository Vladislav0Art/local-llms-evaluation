package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("Hello World!");
        Comment cloneComment = comment.clone();
        assertNotNull(cloneComment);
        assertEquals("#comment", cloneComment.nodeName());
    }

}