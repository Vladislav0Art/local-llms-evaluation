package org.jsoup.nodes;

public class GeneratedCloneReturnsNewInstance {

    @Test
    public void cloneReturnsNewInstance() {
        Comment originalComment = new Comment("Original Data");
        Comment clonedComment = originalComment.clone();
        assertNull(originalComment.getTagName());
        assertNotNull(clonedComment.getTagName());
        assertEquals("#comment", clonedComment.nodeName());
    }

}