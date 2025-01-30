package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsBlankTest_whenNotBlank {

    @Test
    public void isBlankTest_whenNotBlank() {
        TextNode node = new TextNode("Some text");
        assertFalse(node.isBlank());
    }

}