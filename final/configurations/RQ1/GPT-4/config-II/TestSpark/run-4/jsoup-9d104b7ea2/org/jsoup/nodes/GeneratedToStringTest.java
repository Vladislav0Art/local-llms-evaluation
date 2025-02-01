package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");

        assertNotNull(textNode.toString());
        assertTrue(textNode.toString().contains("Test"));
    }

}