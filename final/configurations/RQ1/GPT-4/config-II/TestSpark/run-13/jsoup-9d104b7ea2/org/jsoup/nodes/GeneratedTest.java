package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test Text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test	Text");
        Assert.assertEquals("Test	Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test	Text");
        Assert.assertEquals("Test	Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode nonBlankNode = new TextNode("Test	Text");
        Assert.assertFalse(nonBlankNode.isBlank());

        TextNode blankNode1 = new TextNode("");
        Assert.assertTrue(blankNode1.isBlank());

        TextNode blankNode2 = new TextNode("		");
        Assert.assertTrue(blankNode2.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Test");
        TextNode splittedNode = textNode.splitText(5);
        Assert.assertEquals("Split", textNode.getWholeText());
        Assert.assertEquals(" Test", splittedNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test Text");
        textNode.splitText(-5);
    }

    @Test
    public void splitTextOffsetExceedsLengthTest() {
        TextNode textNode = new TextNode("Test Text");
        textNode.splitText(500);
    }

    @Test
    public void cloneTest() {
        TextNode originalNode = new TextNode("Test Text");
        TextNode clonedNode = originalNode.clone();
        Assert.assertNotSame(originalNode, clonedNode);
        Assert.assertEquals(originalNode.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test&lt;Text&gt;");
        Assert.assertEquals("Test<Text>", textNode.getWholeText());
    }

}