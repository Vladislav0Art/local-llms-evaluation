package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedToStringTests {

    @Test
    public void toStringTests() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.toString());
    }

}