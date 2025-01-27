package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_SplittingAtEnd_ReturnsSameTextNode {

    @Test
    public void splitText_SplittingAtEnd_ReturnsSameTextNode() {
        TextNode node = new TextNode("Hello");
        TextNode result = node.splitText(node.text().length());
        assertTrue(result.equals(node));
    }

}