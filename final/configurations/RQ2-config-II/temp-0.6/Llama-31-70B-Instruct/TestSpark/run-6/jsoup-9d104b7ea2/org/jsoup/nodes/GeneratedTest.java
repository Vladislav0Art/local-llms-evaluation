package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;");
        assertEquals("&lt;", textNode.getWholeText());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   text   ");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("   text   ");
        assertEquals("   text   ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("\n");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splittedTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", splittedTextNode.getWholeText());
    }

}