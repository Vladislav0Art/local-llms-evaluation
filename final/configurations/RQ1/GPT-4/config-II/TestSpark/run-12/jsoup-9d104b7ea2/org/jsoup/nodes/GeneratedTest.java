package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeCreationTest() {
        TextNode textNode = new TextNode("Just Testing.");
        assertNotNull(textNode);
        assertEquals("Just Testing.", textNode.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Just Testing.");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" Test Text. ");
        assertEquals("Test Text.", textNode.text());

        textNode.text("Changed Text.");
        assertEquals("Changed Text.", textNode.getWholeText());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" Test Text. ");
        assertEquals(" Test Text. ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        textNode.text(" Not Blank Text ");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("Hello,", textNode.getWholeText());
        assertEquals(" World!", tailNode.getWholeText());

        TextNode newTONode = textNode.splitText(2);
        assertEquals("He", newTONode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Hello, World!");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextOffsetExceedingLengthTest() {
        TextNode textNode = new TextNode("Hello, World!");
        textNode.splitText(50);
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertNotNull(textNode.toString());
        assertEquals("Hello, World!", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode cloneNode = textNode.clone();
        assertNotNull(cloneNode);
        assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;p&gt;Hello, World!&lt;/p&gt;");
        assertNotNull(textNode);
        assertEquals("<p>Hello, World!</p>", textNode.getWholeText());
    }

}