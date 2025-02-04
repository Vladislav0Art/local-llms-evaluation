package org.jsoup.nodes;

public class GeneratedCreateCommentNode {

    @Test
    public void createCommentNode() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
        assertNotEquals("", comment.getData());
    }

}