package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nodeNameTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void textTextNodeSetTextTest() {
        TextNode textNode = new TextNode("Hello World");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlankTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankTextNodeBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(5);
        assertEquals("Hello", result.text());
    }

    @Test
    public void outerHtmlHeadTextNodeTest() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, Document.OutputSettings.defaultSettings());
        assertEquals("<text>Hello World</text>", sb.toString());
    }

}