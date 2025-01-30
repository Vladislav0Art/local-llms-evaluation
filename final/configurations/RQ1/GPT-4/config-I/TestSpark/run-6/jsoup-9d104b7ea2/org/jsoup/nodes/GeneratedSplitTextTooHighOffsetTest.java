package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTooHighOffsetTest {

    @Test
    public void splitTextTooHighOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}