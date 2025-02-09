package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCloneTextNodeTest {

    @Test
    public void cloneTextNodeTest() {
        TextNode node = new TextNode("Hello");
        TextNode clone = node.clone();
        assertEquals(node, clone);
    }

}