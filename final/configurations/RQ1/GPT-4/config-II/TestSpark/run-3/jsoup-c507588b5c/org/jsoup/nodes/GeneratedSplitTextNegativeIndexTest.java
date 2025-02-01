package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedSplitTextNegativeIndexTest {

    @Test
    public void splitTextNegativeIndexTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(-1);
    }

}