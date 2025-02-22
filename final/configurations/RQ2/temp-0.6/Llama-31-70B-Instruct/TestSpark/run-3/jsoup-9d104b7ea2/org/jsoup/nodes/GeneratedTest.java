package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void nodeNameTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void getWholeTextTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlankTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTextNodeTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", splitTextNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTextNodeTest() {
        TextNode textNode = new TextNode("text");
        StringWriter writer = new StringWriter();
        try {
            textNode.outerHtmlHead(writer, 0, new Document.OutputSettings());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("text", writer.toString());
    }

    @Test
    public void toStringTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.toString());
    }

}