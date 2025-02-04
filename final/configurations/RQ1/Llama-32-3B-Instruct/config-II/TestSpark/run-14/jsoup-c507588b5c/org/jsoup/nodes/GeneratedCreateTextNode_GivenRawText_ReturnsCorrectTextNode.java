package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateTextNode_GivenRawText_ReturnsCorrectTextNode {

    @Test
    public void createTextNode_GivenRawText_ReturnsCorrectTextNode() {
        String rawText = "Hello, World!";
        TextNode textNode = new TextNode(rawText);
        assertNotNull(textNode);
        assertEquals(rawText, textNode.text());
    }

}