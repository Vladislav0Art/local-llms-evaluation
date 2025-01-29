package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNodeNameTests {

    @Test
    public void nodeNameTests() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.nodeName());
        assertEquals("text", textNode.getText());
    }

}