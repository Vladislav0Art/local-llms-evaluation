package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedNodeName_EmptyTextNode_ReturnsEmpty {

    @Test
    public void nodeName_EmptyTextNode_ReturnsEmpty() {
        TextNode node = new TextNode("");
        assertEquals("text", node.nodeName());
    }

}