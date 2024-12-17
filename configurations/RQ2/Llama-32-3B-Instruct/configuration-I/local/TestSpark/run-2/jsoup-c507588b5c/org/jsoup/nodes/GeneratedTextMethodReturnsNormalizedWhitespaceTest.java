package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextMethodReturnsNormalizedWhitespaceTest {

    @Test
    public void textMethodReturnsNormalizedWhitespaceTest() {
        TextNode node = new TextNode(String.valueOf(Character.toChars('\u200B')));
        assertEquals("", node.text().trim());
    }

}