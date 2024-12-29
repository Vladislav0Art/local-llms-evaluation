package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        assertEquals(textContent, node.getWholeText());
    }

}