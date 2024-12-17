package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        String newText = "Hello World";
        TextNode textNode = new TextNode("");
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}