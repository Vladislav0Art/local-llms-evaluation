package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("     Test    ");
        assertEquals("Test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("     Test    ");
        assertEquals("     Test    ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("     ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split");
        TextNode splitNode = textNode.splitText(3);
        assertEquals("Spl", textNode.getWholeText());
        assertEquals("it", splitNode.getWholeText());
    }

    @Test
    public void splitTextExceptionTest() {
        TextNode textNode = new TextNode("Split");
        textNode.splitText(6);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Clone");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Test&gt;");
        assertEquals("<Test>", textNode.getWholeText());
    }

}