package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" test ");
        assertEquals("test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("test");
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitTextNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, null);
        assertEquals("test", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = (TextNode) textNode.clone();
        assertEquals("test", cloneNode.getWholeText());
    }

}