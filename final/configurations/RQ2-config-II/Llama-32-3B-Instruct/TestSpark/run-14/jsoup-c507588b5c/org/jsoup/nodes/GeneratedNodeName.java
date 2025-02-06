package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

}