package org.jsoup.nodes;

public class GeneratedNewComment_isNew {

    @Test
    public void newComment_isNew() {
        Comment comment = new Comment("Data");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertTrue(comment instanceof LeafNode);
    }

}