package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.value());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textMethodTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void textMethodSplitTextTest() {
        TextNode node = new TextNode("test");
        int offset = 3;
        TextNode tail = node.splitText(offset);
        assertEquals(4, tail.value().length());
    }

    @Test
    public void isBlankTest() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() throws IOException {
        Document document = Parser.parse("<div>test</div>");
        Element element = (Element) document.body().firstChild();
        TextNode textNode = (TextNode) element.firstChild();
        int offset = 3;
        TextNode tail = textNode.splitText(offset);
        assertEquals("te", tail.value());
    }

    @Test
    public void outerHtmlHeadTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream(StandardCharsets.UTF_8.name().getBytes().length);
        Appendable accum = out;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, 0, outSettings);
        assertEquals("<span> test</span>", out.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream(StandardCharsets.UTF_8.name().getBytes().length);
        Appendable accum = out;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        TextNode node = new TextNode("test");
        node.outerHtmlTail(accum, 0, outSettings);
    }

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("test");
        TextNode cloned = original.clone();
        assertEquals(original.value(), cloned.value());
    }

}