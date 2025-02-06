package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsTextNode() {
        TextNode node = new TextNode("");
        assertEquals("text-node", node.nodeName());
    }

    @Test
    public void text_EmptyString_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void text_NonEmptyString_ReturnsText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void text_NullReturnsNull() {
        TextNode node = new TextNode(null);
        assertEquals(null, node.text());
    }

    @Test
    public void getWholeText_EmptyString_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

    @Test
    public void getWholeText_NonEmptyString_ReturnsNonEmptyString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void isBlank_EmptyString_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_NonEmptyString_ReturnsFalse() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void clone_ClonesTextNodeCorrectly() throws Exception {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        TextNode cloned = node.clone();
        assertEquals(originalText, cloned.text());
    }

    @Test
    public void splitText_SplitsTextAtOffset_Correctly() {
        TextNode node = new TextNode("Hello World");
        TextNode result = node.splitText(6);
        assertEquals("World", result.text());
    }

    @Test
    public void outerHtmlHead_PutsHeadTagsInCorrectFormat() throws Exception {
        StringBuilder expected = new StringBuilder("<head></head>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false, true);
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, 1, out);
        assertEquals(expected.toString(), accum.toString());
    }

    @Test
    public void outerHtmlTail_PutsTailTagsInCorrectFormat() throws Exception {
        StringBuilder expected = new StringBuilder("<tail></tail>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(false, false, true);
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, 1, out);
        assertEquals(expected.toString(), accum.toString());
    }

    @Test
    public void toString_ReturnsCorrectString() {
        TextNode node = new TextNode("Hello World");
        String result = node.toString();
        assertEquals("text-node: Hello World", result);
    }

}