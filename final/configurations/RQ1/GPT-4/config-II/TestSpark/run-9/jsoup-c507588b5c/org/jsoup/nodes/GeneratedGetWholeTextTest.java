package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "Sample text with spaces   and    tabs";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}