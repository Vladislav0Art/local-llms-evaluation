package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        String text = "Sample text";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}