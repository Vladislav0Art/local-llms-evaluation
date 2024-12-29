package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        assertTrue(node.toString().contains(textContent));
    }

}