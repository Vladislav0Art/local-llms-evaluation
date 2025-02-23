package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Entities;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&amp;lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.getWholeText());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   test   ");
        assertEquals("test", textNode.text());
        textNode.text("   new test   ");
        assertEquals("new test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("some text");
        assertEquals("some text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());
        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());
        TextNode textNode3 = new TextNode("   text   ");
        assertTrue(!textNode3.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("some text");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("some ", textNode.getWholeText());
        assertEquals("text", tailNode.getWholeText());
    }

}