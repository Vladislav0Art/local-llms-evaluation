package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedTextStringRepresentationTest {

    @Test
    public void textStringRepresentationTest() {
        StringBuilder expectedBuilder = new StringBuilder("<p>expected text</p>");
        String expectedText = "expected text";
        TextNode node = new TextNode(expectedText);
        assertEquals(expectedText, node.toString());
    }

}