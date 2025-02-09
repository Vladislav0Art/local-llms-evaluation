package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());
    }

    @Test
    public void NodeNameTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void GetWholeTextTest() {
        TextNode textNode = new TextNode("Get Whole Text");
        assertEquals("Get Whole Text", textNode.getWholeText());
    }

    @Test
    public void IsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void IsNotBlankTest() {
        TextNode textNode = new TextNode("Not Blank");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void SplitTextTest() {
        TextNode textNode = new TextNode("Split Text");
        assertEquals("Split", textNode.splitText(5).text());
    }

    @Test
    public void ToStringTest() {
        TextNode textNode = new TextNode("ToString Test");
        assertEquals("ToString Test", textNode.toString());
    }

    @Test
    public void CloneTest() {
        TextNode textNode = new TextNode("Clone Test");
        assertEquals(textNode, textNode.clone());
    }

    @Test
    public void CreateFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Encoded&amp;Test");
        assertEquals("Encoded&Test", textNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document("").outputSettings().syntax(Syntax.html));
        assertEquals("Test", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document("").outputSettings().syntax(Syntax.html));
        assertEquals("", accum.toString());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Changed", textNode.text("Changed").text());
    }

}