package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName_ValidText_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ValidText_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

}