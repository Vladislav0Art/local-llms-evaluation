package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeName_ReturnsTextNodeName() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String text = "TextNode";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals("TextNode", textNode.nodeName());
    }

    @Test
    public void text_GivesText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode();
        textNode.text(text);
        Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void getWholeText_GivesCompleteText() throws IOException {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String html = doc.outerHtml();
        TextNode textNode = doc.selectFirst("text-node");
        Assert.assertEquals(html, textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsTrueWhenTextIsBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsFalse() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_setsOffset() throws IOException {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String html = doc.outerHtml();
        TextNode textNode = doc.selectFirst("text-node");
        int offset = 10;
        textNode.splitText(offset);
        Assert.assertEquals(offset, 10);
    }

    @Test
    public void toString_ReturnsTextNodeAsString() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String html = doc.outerHtml();
        TextNode textNode = doc.selectFirst("text-node");
        Assert.assertTrue(html.contains(textNode.toString()));
    }

    @Test
    public void clone_ReturnsTextNodeWithSameText() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String text = "Hello World!";
        TextNode textNode = new TextNode();
        textNode.text(text);
        TextNode cloned = new TextNode().clone(textNode);
        Assert.assertEquals(text, cloned.text());
    }

    @Test
    public void createTextNode_ReturnsTextNode() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String text = "UTF-8";
        TextNode textNode = doc.createTextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void normaliseWhitespace_GivesNormalizedText() {
        String text = "\t\tHello World!";
        TextNode textNode = new TextNode();
        String normalized = TextNode.normaliseWhitespace(text);
        Assert.assertEquals("   Hello World!", normalized);
    }

    @Test
    public void stripLeadingWhitespace_GivesTextWithTrailingWhitespaceRemoved() {
        String text = "\t\tHello World!";
        TextNode textNode = new TextNode();
        String stripped = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals("  Hello World!", stripped);
    }

}