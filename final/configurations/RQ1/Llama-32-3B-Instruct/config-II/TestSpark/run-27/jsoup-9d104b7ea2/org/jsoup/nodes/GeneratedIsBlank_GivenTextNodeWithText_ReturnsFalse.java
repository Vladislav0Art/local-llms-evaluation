package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedIsBlank_GivenTextNodeWithText_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNodeWithText_ReturnsFalse() {
        Document document = new Document();
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}