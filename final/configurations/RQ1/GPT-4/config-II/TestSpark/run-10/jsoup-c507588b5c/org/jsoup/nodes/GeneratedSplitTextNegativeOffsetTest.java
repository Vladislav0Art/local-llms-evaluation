package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("split me");
        textNode.splitText(-5);
    }

}