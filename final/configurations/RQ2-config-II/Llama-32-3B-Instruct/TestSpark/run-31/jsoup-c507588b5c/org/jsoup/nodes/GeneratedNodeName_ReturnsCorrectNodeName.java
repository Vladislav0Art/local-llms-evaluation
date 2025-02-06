package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

}