package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Hello World!");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("Hello", textNode.getWholeText());
        assertEquals(" World!", tailNode.getWholeText());
    }

}