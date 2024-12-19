package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedSplitText_splitsTextNodeAtOffset {

    @Test
    public void splitText_splitsTextNodeAtOffset() {
        // [MethodUnderTest][Scenario]Test
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 5;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World", textNode.coreValue());
        assertEquals("Hello ", tailNode.coreValue());
    }

}