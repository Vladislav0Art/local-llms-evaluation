package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());

        TextNode node2 = new TextNode(" ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("\n");
        assertTrue(node3.isBlank());
    }

}