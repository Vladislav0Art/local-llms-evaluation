package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        String text = " This is a test ";
        TextNode node = new TextNode(text);
        Assert.assertEquals("This is a test", node.text());
        Assert.assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("   \n   ");
        Assert.assertTrue(node.isBlank());

        node = new TextNode("Something here");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "This is to be splitted";
        TextNode node = new TextNode(text);

        TextNode splitted = node.splitText(7);

        Assert.assertEquals("This is", node.text());
        Assert.assertEquals(" to be splitted", splitted.text());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode node2 = node.clone();

        Assert.assertEquals(node.nodeName(), node2.nodeName());
        Assert.assertEquals(node.text(), node2.text());
    }

    @Test
    public void splitTextOutOfBoundsNegativeTest() {
        TextNode node = new TextNode("This is some text");
        node.splitText(-1); // this should throw an exception
    }

    @Test
    public void splitTextOutOfBoundsOverTextLengthTest() {
        TextNode node = new TextNode("This is some text");
        node.splitText(50); // this should throw an exception
    }

    @Test
    public void createFromEncodedTest() {
        String testEncoded = "&lt;test&gt;";
        TextNode node = new TextNode("test");
        Assert.assertEquals(node.getWholeText(), TextNode.createFromEncoded(testEncoded).getWholeText());
    }

}