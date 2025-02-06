package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeName_isTextNode() {
        TextNode node = new TextNode("text");
        assertEquals("textNode", node.nodeName());
    }

    @Test
    public void text_returnsText() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.text());
    }

    @Test
    public void text_setsText() {
        TextNode node = new TextNode();
        node.text("new text");
        assertEquals("new text", node.text());
    }

    @Test
    public void getWholeText_returnsEmptyStringForBlank() {
        TextNode node = new TextNode(StringUtil.stripHtmlTags("<br/>"));
        assertTrue(node.isBlank());
        assertEquals("", node.getWholeText());
    }

    @Test
    public void isBlank_returnsTrueForBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_splitsCorrectly() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int offset = 10;
        Document.OutputSettings settings = null;

        TextNode node = new TextNode("0123456789");
        TextNode expectedLeftPart = new TextNode("0123");
        TextNode expectedRightPart = new TextNode("456789");

        node.outerHtmlHead(accum, 0, settings);
        assertEquals(expectedLeftPart.text(), expectedLeftPart.text());
        assertEquals(expectedRightPart.text(), expectedRightPart.text());

        node.splitText(offset);

        assertTrue(outContent.toString().contains(expectedLeftPart.text()));
        assertTrue(outContent.toString().contains(expectedRightPart.text()));
    }

    @Test
    public void outerHtmlHead_generatesCorrectHtml() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 1;
        Document.OutputSettings settings = null;

        TextNode node = new TextNode("<script>alert('test')</script>");
        node.outerHtmlHead(accum, depth, settings);
        assertTrue(outContent.toString().contains("<p class=\"result\"><script>"));
    }

    @Test
    public void outerHtmlTail_generatesCorrectHtml() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 1;

        TextNode node = new TextNode("test");
        Document.OutputSettings settings = null;

        node.outerHtmlTail(accum, depth, settings);
        assertTrue(outContent.toString().contains("<p class=\"result\">test</p>"));
    }

    @Test
    public void clone_returnsCorrectClone() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node.text(), cloned.text());
    }

    @Test
    public void createFromEncoded_readsCorrectly() {
        String encodedText = "<p class=\"result\">test</p>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}