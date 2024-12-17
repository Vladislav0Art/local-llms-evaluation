package org.jsoup.nodes;

public class GeneratedTestNewComment {

    @Test
    public void testNewComment() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("Hello World!", comment.getData());
    }

}