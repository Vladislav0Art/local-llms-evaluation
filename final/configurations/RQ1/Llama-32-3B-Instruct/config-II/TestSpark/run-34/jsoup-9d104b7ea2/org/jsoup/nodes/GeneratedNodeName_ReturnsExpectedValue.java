package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedNodeName_ReturnsExpectedValue {

    @Test
    public void nodeName_ReturnsExpectedValue() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

}