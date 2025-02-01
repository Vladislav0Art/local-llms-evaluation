package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textGetterTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("updated");
        assertEquals("updated", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("whole test");
        assertEquals("whole test", textNode.getWholeText());
    }

    @Test
    public void isBlankPositiveTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankNegativeTest() {
        TextNode textNode = new TextNode("not blank");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextValidOffsetTest() {
        TextNode textNode = new TextNode("split text");
        TextNode newTextNode = textNode.splitText(5);
        assertEquals("split", textNode.getWholeText());
        assertEquals(" text", newTextNode.getWholeText());
    }

    @Test
    public void splitTextInvalidOffsetTest() {
        TextNode textNode = new TextNode("split text");
        textNode.splitText(20);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("encoded &lt; text");
        assertEquals("encoded < text", textNode.getWholeText());
    }

}