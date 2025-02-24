package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedConstructTextNodeTest {

    @Test
    public void constructTextNodeTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

}