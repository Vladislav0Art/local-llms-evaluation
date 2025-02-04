package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSplitText_GivenOffset GreaterThanLength_ReturnsSameTextNode {

    @Test
    public void splitText_GivenOffset

    GreaterThanLength_ReturnsSameTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 10;
        TextNode result = node.splitText(offset);
        assertEquals(node, result);
    }

}