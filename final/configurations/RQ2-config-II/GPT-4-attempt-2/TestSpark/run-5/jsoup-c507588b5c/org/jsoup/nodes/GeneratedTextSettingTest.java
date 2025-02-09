package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSettingTest {

    @Test
    public void textSettingTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Replaced Text");

        assertEquals("Replaced Text", textNode.text());
    }

}