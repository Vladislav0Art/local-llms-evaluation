package org.jsoup.nodes;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        Comment comment = new Comment("test");
        assertEquals("COMMENT", comment.nodeName());
    }

}