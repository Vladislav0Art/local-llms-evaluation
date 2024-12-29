package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTextUpdateTest {

    @Test
    public void textUpdateTest() {
        String textContent = "test";
        TextNode node = new TextNode("");
        node.text(textContent);
        assertEquals(textContent, node.text());
    }

}