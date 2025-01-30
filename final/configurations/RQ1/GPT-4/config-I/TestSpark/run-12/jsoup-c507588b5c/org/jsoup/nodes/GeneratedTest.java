package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        String sampleText = "Textnode test";
        TextNode node = new TextNode(sampleText);
        Assert.assertEquals(sampleText, node.text());
    }

    @Test
    public void textSetAndGetTest() {
        String sampleText = "Textnode test";
        TextNode node = new TextNode("");
        node.text(sampleText);
        Assert.assertEquals(sampleText, node.getWholeText());
    }

    @Test
    public void getWholeTextTest() {
        String sampleText = "Textnode test    with white spaces";
        TextNode node = new TextNode(sampleText);
        Assert.assertEquals(sampleText, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        String sampleText = "";
        TextNode node = new TextNode(sampleText);
        Assert.assertTrue(node.isBlank());

        sampleText = "     ";
        node = new TextNode(sampleText);
        Assert.assertTrue(node.isBlank());

        sampleText = "Test";
        node = new TextNode(sampleText);
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        String sampleText = "to test splitText";
        TextNode node = new TextNode(sampleText);
        TextNode splitNode = node.splitText(6);
        Assert.assertEquals("to test", node.getWholeText());
        Assert.assertEquals(" splitText", splitNode.getWholeText());
    }

    @Test
    public void splitTextInvalidOffsetTest() {
        String sampleText = "to test splitText";
        TextNode node = new TextNode(sampleText);
        node.splitText(-1);
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String sampleText = "Test";
        TextNode node = new TextNode(sampleText);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        node.outerHtmlHead(accum, 1, out);
        Assert.assertEquals(sampleText, accum.toString());
    }

    @Test
    public void createFromEncodedTest() {
        String sampleText = "&lt;div&gt;Test&lt;/div&gt;";
        TextNode node = TextNode.createFromEncoded(sampleText);
        Assert.assertEquals("<div>Test</div>", node.text());
    }

    @Test
    public void cloneTest() {
        String sampleText = "Test";
        TextNode node = new TextNode(sampleText);
        TextNode clone = node.clone();
        Assert.assertNotSame(node, clone);
        Assert.assertEquals(node.text(), clone.text());
    }

}