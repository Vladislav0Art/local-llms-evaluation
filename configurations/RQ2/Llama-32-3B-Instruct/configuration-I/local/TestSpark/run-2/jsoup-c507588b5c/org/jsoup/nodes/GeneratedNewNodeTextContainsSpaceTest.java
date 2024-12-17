package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewNodeTextContainsSpaceTest {

    @Test
    public void newNodeTextContainsSpaceTest() {
        TextNode node = new TextNode("   ");
        assertTrue(node.contains(" "));
    }

}