package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_NonEmptyText_ReturnsFalse {

    @Test
    public void isBlank_NonEmptyText_ReturnsFalse() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

}