package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private static final Comment COMMENT = new Comment("This is an example comment");

    @Test
    public void testNodeName() {
        assertEquals("#comment", COMMENT.nodeName());
    }

}