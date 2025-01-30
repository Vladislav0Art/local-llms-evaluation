package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsBlankTest_whenBlank {

    @Test
    public void isBlankTest_whenBlank() {
        TextNode node = new TextNode("    ");
        assertTrue(node.isBlank());
    }

}