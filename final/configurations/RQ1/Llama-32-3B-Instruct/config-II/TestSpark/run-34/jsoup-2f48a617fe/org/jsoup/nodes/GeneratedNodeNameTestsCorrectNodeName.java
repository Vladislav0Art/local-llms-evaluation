package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeNameTestsCorrectNodeName {

    @Test
    public void nodeNameTestsCorrectNodeName() {
        Comment comment = new Comment("This is a test");
        assertEquals("#comment", comment.nodeName());
    }

}