package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_isTextNode {

    @Test
    public void nodeName_isTextNode() {
        TextNode node = new TextNode("text");
        assertEquals("textNode", node.nodeName());
    }

}