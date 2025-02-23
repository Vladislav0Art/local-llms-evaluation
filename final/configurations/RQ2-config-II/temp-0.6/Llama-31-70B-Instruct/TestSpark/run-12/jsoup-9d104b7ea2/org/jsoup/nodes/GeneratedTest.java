package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    TextNode textNode;

    @Test
    public void testConstructor() {
        String text = "Constructor test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Node name");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        String text = "Text test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void testGetWholeText() {
        String text = "Whole text test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        String text = " ";
        TextNode textNode = new TextNode(text);
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "Split text test";
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Split", textNode.getWholeText());
        assertEquals("text test", splitTextNode.getWholeText());
    }

}