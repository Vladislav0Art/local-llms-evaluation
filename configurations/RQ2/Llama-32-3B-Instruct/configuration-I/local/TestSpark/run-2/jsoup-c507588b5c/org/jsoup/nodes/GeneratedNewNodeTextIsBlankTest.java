package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewNodeTextIsBlankTest {

    @Test
    public void newNodeTextIsBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}