package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTextSetterAndGetWholeTextTest {

    @Test
    public void textSetterAndGetWholeTextTest() {
        TextNode textNode = new TextNode("example text");
        String newText = "new text";
        textNode.text(newText);
        assertEquals(newText, textNode.getWholeText());
    }

}