package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testOuterHtmlHead_MultiLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode1 = TextNode.createText("Hello,\n World!");
        textNode1.outerHtmlHead(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode1.outerHtml()));
    }

    @Test
    public void testOuterHtmlHead_SingleLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode1 = TextNode.createText("Hello, World!");
        textNode1.outerHtmlHead(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode1.outerHtml()));
    }

    @Test
    public void testOuterHtmlTail_MultiLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode2 = TextNode.createText("Hello,\n World!");
        textNode2.outerHtmlTail(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode2.outerHtml()));
    }

    @Test
    public void testOuterHtmlTail_SingleLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode3 = TextNode.createText("Hello, World!");
        textNode3.outerHtmlTail(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode3.outerHtml()));
    }

    @Test
    public void testNormaliseWhitespace_MultiLineText() {
        String output = TextNode.normaliseWhitespace("   Hello World ");
        assertFalse(output.contains("\n"));
    }

    @Test
    public void testStripLeadingWhitespace_SingleLineText() {
        String output = TextNode.stripLeadingWhitespace("   Hello World");
        assertTrue(!output.startsWith("   "));
    }

}