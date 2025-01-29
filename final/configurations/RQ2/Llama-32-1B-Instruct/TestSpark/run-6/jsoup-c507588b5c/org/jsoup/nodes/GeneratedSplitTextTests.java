package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTests {

    @Test
    public void splitTextTests() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals(3, textNode.splitText(2).getText().length());
    }

}