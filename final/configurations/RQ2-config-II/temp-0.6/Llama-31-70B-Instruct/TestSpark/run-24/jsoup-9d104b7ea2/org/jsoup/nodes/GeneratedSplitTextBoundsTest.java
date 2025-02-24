package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextBoundsTest {

    @Test
    public void splitTextBoundsTest() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.splitText(-1);
    }

}