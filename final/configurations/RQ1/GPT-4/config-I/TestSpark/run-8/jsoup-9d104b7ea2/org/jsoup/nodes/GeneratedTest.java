package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textPlainConstructorTest() {
        TextNode textNode = new TextNode("Text Node Test");
        assertEquals("#text", textNode.nodeName());
        assertEquals("Text Node Test", textNode.text());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" Text Node Test ");
        assertEquals("Text Node Test", textNode.text());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Text");
        TextNode splitText = textNode.splitText(5);
        assertEquals("Split", textNode.text());
        assertEquals(" Text", splitText.text());
    }

    @Test
    public void splitTextOffsetNegativeTest() {
        TextNode textNode = new TextNode("Split Text");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextOffsetGreaterTest() {
        TextNode textNode = new TextNode("Split Text");
        textNode.splitText(20);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Encoded Test&gt;");
        assertEquals("<Encoded Test>", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Text Node Test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" Get Whole Text ");
        assertEquals(" Get Whole Text ", textNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode originalTextNode = new TextNode("Clone Test");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws Exception {
        TextNode tn = new TextNode(" Text Node ");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tn.outerHtmlHead(accum, 0, out);
        assertEquals(" Text Node ", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws Exception {
        TextNode tn = new TextNode(" ");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tn.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}