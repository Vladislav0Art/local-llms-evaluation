package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTextContentTest {

    @Test
    public void textContentTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        assertEquals(textContent, node.text());
    }

}