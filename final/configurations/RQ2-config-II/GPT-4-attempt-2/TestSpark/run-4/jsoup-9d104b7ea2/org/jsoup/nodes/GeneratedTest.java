package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode node = new TextNode("Test Text");
        Assert.assertEquals("Test Text", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test Text");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textGetSetTest() {
        TextNode node = new TextNode("");
        node.text("Test Text");
        Assert.assertEquals("Test Text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Test Text");
        Assert.assertEquals("Test Text", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(" ");
        Assert.assertTrue(node.isBlank());
        node.text("Test Text");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test Text");
        TextNode newNode = node.splitText(4);
        Assert.assertEquals("Test", node.getWholeText());
        Assert.assertEquals(" Text", newNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode("Test Text");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        node.outerHtmlHead(sb, 0, outputSettings);
        Assert.assertEquals("Test Text", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode("Test Text");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        node.outerHtmlTail(sb, 0, outputSettings);
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode node = new TestNode("Test Text");
        Assert.assertThat(node.toString(), containsString("Test Text"));
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test Text");
        TextNode clone = node.clone();
        Assert.assertNotSame(node, clone);
        Assert.assertEquals(node.getWholeText(), clone.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Test &amp; Text", false);
        Assert.assertEquals("Test & Text", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace("Test     Text");
        Assert.assertEquals("Test Text", text);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = TextNode.stripLeadingWhitespace("     Test Text");
        Assert.assertEquals("Test Text", text);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Test Text "));
        Assert.assertTrue(isWhitespace);
        isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Test Text"));
        Assert.assertFalse(isWhitespace);
    }

}