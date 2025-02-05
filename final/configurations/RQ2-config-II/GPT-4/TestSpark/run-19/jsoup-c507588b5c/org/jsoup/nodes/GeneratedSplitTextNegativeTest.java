package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedSplitTextNegativeTest {

    @Test
    public void splitTextNegativeTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

}