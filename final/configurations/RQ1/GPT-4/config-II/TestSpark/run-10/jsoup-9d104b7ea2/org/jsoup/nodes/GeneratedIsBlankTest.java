package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("some text");
        assertFalse(textNode.isBlank());
    }

}