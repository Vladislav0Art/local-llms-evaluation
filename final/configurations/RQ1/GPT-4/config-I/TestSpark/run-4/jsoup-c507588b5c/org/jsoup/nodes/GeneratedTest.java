package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("  test  ");
        assertEquals("test", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("  test  ");
        assertEquals("  test  ", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode blankNode = new TextNode("     ");
        assertTrue(blankNode.isBlank());

        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);

        assertEquals("te", node.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode node = new TextNode("test");
        node.splitText(-1);
    }

    @Test
    public void splitTextExceedingOffsetTest() {
        TextNode node = new TextNode("test");
        node.splitText(5);
    }

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("test");
        node.text("changed");
        assertEquals("changed", node.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode cloneNode = node.clone();

        assertNotSame(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.toString());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&amp;lt;test&amp;gt;");
        assertEquals("<test>", node.getWholeText());
    }

}