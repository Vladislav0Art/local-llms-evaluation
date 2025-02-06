package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        String nodeName = new TextNode("text").nodeName();
        assertEquals("text", nodeName);
    }

}