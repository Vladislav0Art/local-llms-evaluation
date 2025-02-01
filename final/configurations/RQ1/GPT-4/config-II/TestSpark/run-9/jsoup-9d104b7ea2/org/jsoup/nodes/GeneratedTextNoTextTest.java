package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNoTextTest {

    @Test
    public void textNoTextTest() {
        TextNode textNode = new TextNode("");

        assertEquals("", textNode.text());
    }

}