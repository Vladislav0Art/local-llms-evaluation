package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

    @Test
    public void nodeName_NonBlankTextNode_ReturnsText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.getNodeName());
    }

    @Test
    public void text_EmptyTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getText());
    }

    @Test
    public void text_NonBlankTextNode_ReturnsText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.getText());
    }

    @Test
    public void text_SplitTextNode

    text() {
        TextNode textNode = new TextNode("Hello\nWorld");
        String text = ((TextNode) textNode.splitText(0).splitText(textNode.getText().length())).getText();
        assertEquals("Hello\nWorld", text);
    }

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_NonBlankTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void clone_CloneReturnsSameObject() {
        TextNode textNode = new TextNode("Hello");
        TextNode cloned = (TextNode) textNode.clone();
        assertSame(cloned, ((TextNode) textNode.clone()));
    }

    @Test
    public void splitText_SplittingAtOffset_CreatesSplitTextNode() throws IOException {
        TextNode textNode = new TextNode("HelloWorld");
        TextNode splitTextNode1 = (TextNode) textNode.splitText(0);
        TextNode splitTextNode2 = (TextNode) splitTextNode1.splitText(splitTextNode1.getText().length());
        assertEquals("Hello", splitTextNode1.getText());
        assertEquals("World", splitTextNode2.getText());
    }

    @Test
    public void outerHtmlHead_AndTail_HtmlStringsAreCombined() throws IOException {
        TextNode textNode = new TextNode("Hello");
        StringBuilder html = new StringBuilder();
        Appendable appendable = new StringBuffer();
        textNode.outerHtmlHead(appendable, 0, null);
        textNode.outerHtmlTail(appendable, 0, null);
        assertEquals("<p>Hello</p>", html.toString());
    }

    @Test
    public void toString_ReturnsNormalizedText() {
        TextNode textNode = new TextNode("Hello\nWorld");
        String text = textNode.toString();
        assertEquals("Hello\nWorld", text);
    }

}