package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeSplitTextTest]

Test {

    @Test
    public void [TextNodeSplitTextTest]Test() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode splitNode = node.splitText(offset);
        assertNotNull(splitNode.value);
        assertEquals("World", splitNode.text());
        assertNotNull(node.nextSibling());
    }

}