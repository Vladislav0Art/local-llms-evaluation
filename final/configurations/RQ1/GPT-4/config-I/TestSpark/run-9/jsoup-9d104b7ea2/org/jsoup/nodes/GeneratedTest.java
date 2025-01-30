package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode tn = new TextNode("   Hello, World!  ");
        assertEquals("Hello, World!", tn.text());
        assertEquals("   Hello, World!  ", tn.getWholeText());

        tn.text("   Hi, World!  ");
        assertEquals("Hi, World!", tn.text());
        assertEquals("   Hi, World!  ", tn.getWholeText());
    }

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode(" test text ");
        String wholeText = tn.text();
        assertEquals("test text", wholeText);
    }

    @Test
    public void isBlankTest() {
        TextNode tn = new TextNode("");
        assertTrue(tn.isBlank());

        tn = new TextNode("  ");
        assertTrue(tn.isBlank());

        tn = new TextNode("test");
        assertFalse(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("Hello World");
        TextNode splittedNode = tn.splitText(6);
        assertEquals("Hello ", tn.getWholeText());
        assertEquals("World", splittedNode.getWholeText());
    }

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("Hello World");
        assertEquals("Hello World", tn.toString());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("Hello World");
        TextNode clonedNode = tn.clone();
        assertEquals(tn.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Paragraph&lt;/p&gt;";
        TextNode tn = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>Paragraph</p>", tn.getWholeText());
    }

}