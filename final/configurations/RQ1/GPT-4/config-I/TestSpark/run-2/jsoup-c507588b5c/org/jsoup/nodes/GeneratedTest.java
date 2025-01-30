package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        String value = "Test TextNode";
        TextNode node = new TextNode(value);
        Assert.assertEquals(value, node.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Node Test");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textGetterTest() {
        String expected = "TestText";
        String value = " TestText    ";
        TextNode tn = new TextNode(value);
        Assert.assertEquals(expected, tn.text());
    }

    @Test
    public void textSetterTest() {
        TextNode tn = new TextNode("Test");
        String newValue = "New value for text";
        tn.text(newValue);
        Assert.assertEquals(newValue, tn.getWholeText());
    }

    @Test
    public void getWholeTextTest() {
        String value = "    WholeText    Test   ";
        TextNode tn = new TextNode(value);
        Assert.assertEquals(value, tn.getWholeText());
    }

    @Test
    public void isBlankTestTrue() {
        TextNode tn = new TextNode("     ");
        Assert.assertTrue(tn.isBlank());
    }

    @Test
    public void isBlankTestFalse() {
        TextNode tn = new TextNode("Not blank");
        Assert.assertFalse(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("SplitText");
        TextNode splitNode = tn.splitText(4);
        Assert.assertEquals("Split", tn.getWholeText());
        Assert.assertEquals("Text", splitNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode tn = new TextNode("SplitText");
        tn.splitText(-1);
    }

    @Test
    public void splitTextOutOfBoundsOffsetTest() {
        TextNode tn = new TextNode("SplitText");
        tn.splitText(20);
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("CloneText");
        TextNode clone = tn.clone();
        Assert.assertNotSame(tn, clone);
        Assert.assertEquals(tn.getWholeText(), clone.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encoded = "&amp; &gt; &lt;";
        TextNode tn = TextNode.createFromEncoded(encoded);
        Assert.assertEquals("& > <", tn.getWholeText());
    }

}