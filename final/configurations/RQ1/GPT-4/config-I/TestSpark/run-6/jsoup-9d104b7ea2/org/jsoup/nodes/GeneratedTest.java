package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        String testString = "test";
        TextNode textNode = new TextNode(testString);
        assertEquals(testString, textNode.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textGetTest() {
        String testString = "test    ";
        TextNode textNode = new TextNode(testString);
        assertEquals("test", textNode.text());
    }

    @Test
    public void textSetTest() {
        String testString = "test    ";
        TextNode textNode = new TextNode("");
        textNode.text(testString);
        assertEquals("test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        String testString = "test    ";
        TextNode textNode = new TextNode(testString);
        assertEquals(testString, textNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("     ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "testtest";
        int offset = 4;
        TextNode headNode = new TextNode(text);
        TextNode tailNode = headNode.splitText(offset);
        assertEquals("test", headNode.getWholeText());
        assertEquals("test", tailNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<test>", textNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextTooHighOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}