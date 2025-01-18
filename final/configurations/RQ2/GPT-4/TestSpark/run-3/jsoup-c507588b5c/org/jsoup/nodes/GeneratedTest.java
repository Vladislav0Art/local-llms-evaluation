package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("Sample text");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Sample text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textGetSetTest() {
        TextNode textNode = new TextNode("Sample text");
        assertEquals("Sample text", textNode.text());

        textNode.text("Changed text");
        assertEquals("Changed text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Sample text");
        assertEquals("Sample text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode nonBlankNode = new TextNode("Sample text");
        assertFalse(nonBlankNode.isBlank());

        TextNode blankNode = new TextNode("    ");
        assertTrue(blankNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode splitNode = textNode.splitText(7);

        assertEquals("Hello, ", textNode.text());
        assertEquals("world!", splitNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Sample text");
        assertEquals("Sample text", textNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("Hello, world!");
        TextNode clone = original.clone();

        assertNotNull(clone);
        assertEquals(original.text(), clone.text());
        assertNotSame(original, clone);
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Hello, world!");
        String expectedOutput = "TextNode{text='Hello, world!'}";

        assertEquals(expectedOutput, textNode.toString());
    }

}