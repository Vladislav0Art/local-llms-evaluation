package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextTests {

    @Test
    public void textTests() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode.getText());
    }

}