package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTextNodeSplitTextTest {

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.coreValue());
        assertEquals("st", splitTextNode.coreValue());
    }

}