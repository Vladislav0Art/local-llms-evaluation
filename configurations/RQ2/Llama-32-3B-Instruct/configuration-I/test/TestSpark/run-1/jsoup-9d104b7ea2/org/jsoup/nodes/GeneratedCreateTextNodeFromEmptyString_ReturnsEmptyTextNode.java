package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedCreateTextNodeFromEmptyString_ReturnsEmptyTextNode {

    @Test
    public void createTextNodeFromEmptyString_ReturnsEmptyTextNode() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertTrue(textNode.text().isEmpty());
    }

}