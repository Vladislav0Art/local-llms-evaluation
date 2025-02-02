package org.jsoup.nodes;

public class GeneratedTestCommentNodeName {

    @Test
    public void testCommentNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("comment", comment.nodeName());
    }

}