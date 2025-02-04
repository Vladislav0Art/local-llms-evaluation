package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNewTextNodeCreationTest {

    @Test
    public void newTextNodeCreationTest() {
        String expected = "expected text";
        TextNode node = new TextNode(expected);
        assertEquals(expected, node.text());
    }

}