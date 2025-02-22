package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("test");
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", textNode2.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("test");
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);

        try {
            textNode.outerHtmlHead(appendable, 1, outputSettings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(" test", appendable.toString());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

}