package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_splitText]

Test {

    @Test
    public void [TextNode_splitText]Test() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = textNode.splitText(6);
        assertNotNull(splitTextNode);
        assertEquals("World", splitTextNode.text());
    }

}