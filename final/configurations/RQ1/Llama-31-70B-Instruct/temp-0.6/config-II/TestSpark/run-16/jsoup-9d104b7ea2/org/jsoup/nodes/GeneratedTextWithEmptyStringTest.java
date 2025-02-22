package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTextWithEmptyStringTest {

    @Test
    public void textWithEmptyStringTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}