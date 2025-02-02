package org.jsoup.nodes;

public class GeneratedTestCommentToString {

    @Test
    public void testCommentToString() {
        Comment comment = new Comment("Hello, world!");
        assertEquals("#comment", comment.nodeName());
        assertEquals("Hello, world!", comment.getData());
    }

}