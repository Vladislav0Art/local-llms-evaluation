package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

}