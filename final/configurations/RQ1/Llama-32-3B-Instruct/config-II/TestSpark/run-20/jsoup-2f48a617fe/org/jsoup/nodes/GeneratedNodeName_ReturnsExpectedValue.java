package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsExpectedValue {

    @Test
    public void nodeName_ReturnsExpectedValue() {
        Comment comment = new Comment("Hello World");
        assertEquals("#comment", comment.nodeName());
    }

}