package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedSplitText_GivenTextNodeSplitAtOffset_ReturnsNewTextNode {

    private final TextNode node1 = new TextNode("Hello World");
    private final TextNode node2 = new TextNode("");
    private final TextNode node3 = new TextNode("\n\n");

    @Test
    public void splitText_GivenTextNodeSplitAtOffset_ReturnsNewTextNode() throws IOException {
        TextNode tail = node1.splitText(7);
        assertNotNull(tail);
        assertEquals("World", tail.text());
    }

}