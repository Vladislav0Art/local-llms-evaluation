package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest_NotBlank {

    @Test
    public void isBlankTest_NotBlank() {
        TextNode node = new TextNode("Hello, World!");
        assertFalse(node.isBlank());
    }

}