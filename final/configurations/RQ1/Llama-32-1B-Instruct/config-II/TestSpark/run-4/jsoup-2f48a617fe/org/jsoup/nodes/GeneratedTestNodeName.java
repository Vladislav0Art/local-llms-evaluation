package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("#comment", comment.nodeName());
    }

}