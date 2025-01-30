package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode(" test text ");
        assertEquals("test text", textNode.text());
    }

    @Test
    public void setTextUpdateValueTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.getWholeText());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("\n test \n");
        assertEquals("\n test \n", textNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(2);
        assertNotNull(result);
        assertEquals("st", result.text());
        assertEquals("te", textNode.text());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextLargeOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloned = textNode.clone();
        assertNotNull(cloned);
        assertEquals(textNode.getWholeText(), cloned.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("test&amp;");
        assertNotNull(textNode);
        assertEquals("test&", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("   test   text   ");
        assertEquals("test text", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("   test text");
        assertEquals("test text", result);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test text "));
        assertTrue(result);
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test text"));
        assertFalse(result);
    }

}