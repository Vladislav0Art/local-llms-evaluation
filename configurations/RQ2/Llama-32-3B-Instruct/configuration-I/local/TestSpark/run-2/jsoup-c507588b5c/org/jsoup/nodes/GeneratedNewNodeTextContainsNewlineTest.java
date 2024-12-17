package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewNodeTextContainsNewlineTest {

    @Test
    public void newNodeTextContainsNewlineTest() {
        TextNode node = new TextNode("\n");
        assertTrue(node.contains("\n"));
    }

}