package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedEmptyTextNodeTest {

    @Test
    public void emptyTextNodeTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}