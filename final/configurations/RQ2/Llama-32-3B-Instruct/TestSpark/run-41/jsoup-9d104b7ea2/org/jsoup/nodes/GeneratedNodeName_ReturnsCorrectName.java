package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName_ReturnsCorrectName {

    @Test
    public void nodeName_ReturnsCorrectName() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

}