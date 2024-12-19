package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName ReturnsCorrectString {

    @Test
    public void nodeName

    ReturnsCorrectString() {
        Comment comment = new Comment("Some data");
        assertEquals("#comment", comment.nodeName());
    }

}