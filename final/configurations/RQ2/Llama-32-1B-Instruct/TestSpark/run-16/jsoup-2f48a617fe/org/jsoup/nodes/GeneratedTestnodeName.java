package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private LeafNode comment;

    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testnodeName() {
        assertEquals("comment", comment.nodeName());
    }

}