package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_createFromEncoded]

Test {

    @Test
    public void [TextNode_createFromEncoded]Test() throws IOException {
        TextNode textNode = TextNode.createFromEncoded("%5CHello%20World%");
        assertEquals("Hello World", textNode.text());
    }

}