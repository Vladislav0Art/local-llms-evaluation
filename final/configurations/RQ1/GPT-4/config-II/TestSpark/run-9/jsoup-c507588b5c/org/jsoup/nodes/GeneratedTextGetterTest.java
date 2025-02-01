package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        String text = "Sample text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}