package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "Sample text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}