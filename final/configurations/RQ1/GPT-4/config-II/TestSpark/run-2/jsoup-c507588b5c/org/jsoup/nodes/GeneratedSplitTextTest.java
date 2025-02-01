package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String value = "Test value";
        TextNode node = new TextNode(value);

        TextNode newNode = node.splitText(4);

        assertEquals("Test", node.getWholeText());
        assertEquals(" value", newNode.getWholeText());
    }

}