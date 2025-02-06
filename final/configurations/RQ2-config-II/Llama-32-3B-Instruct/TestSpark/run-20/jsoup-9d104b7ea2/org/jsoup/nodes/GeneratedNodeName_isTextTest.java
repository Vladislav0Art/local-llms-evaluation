package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_isTextTest {

    @Test
    public void nodeName_isTextTest() {
        String nodeName = "text";
        TextNode node = new TextNode(nodeName);
        assertEquals(nodeName, node.nodeName());
    }

}