package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void createTextNodeTest() {
        String text = "test";
        TextNode node = new TextNode(text);

        assertNotNull(node);
        assertEquals(text, node.text());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);

        assertNotNull(node);
        assertEquals("<", node.text());
    }

    @Test
    public void textTest() {
        String text = "test";
        TextNode node = new TextNode(text);

        assertEquals(text, node.text());
        assertEquals("test", node.text("new text").text());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");

        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode parentNode = mock(Element.class);
        when(parentNode.isBlock()).thenReturn(true);

        TextNode node = new TextNode("test text");
        node.setParentNode(parentNode);

        TextNode splitNode = node.splitText(5);

        assertEquals("test ", node.text());
        assertEquals("text", splitNode.text());
    }

}