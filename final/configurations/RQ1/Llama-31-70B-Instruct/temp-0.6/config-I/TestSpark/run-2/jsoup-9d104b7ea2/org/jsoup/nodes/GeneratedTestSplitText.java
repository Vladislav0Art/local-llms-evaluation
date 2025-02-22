package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("test");
        TextNode newNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", newNode.text());
    }

}