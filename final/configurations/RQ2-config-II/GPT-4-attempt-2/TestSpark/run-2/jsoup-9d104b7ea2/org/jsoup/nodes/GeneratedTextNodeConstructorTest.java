package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());
    }

}