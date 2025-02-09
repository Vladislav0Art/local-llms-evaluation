package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode tn = new TextNode("Test");
        Assert.assertEquals("Test", tn.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("");
        Assert.assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textTest() {
        TextNode tn = new TextNode("Old");
        tn.text("New");
        Assert.assertEquals("New", tn.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("test");
        Assert.assertEquals("test", tn.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode tn = new TextNode("");
        Assert.assertTrue(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("Original");
        TextNode split = tn.splitText(4);
        Assert.assertEquals("Orig", tn.getWholeText());
        Assert.assertEquals("inal", split.getWholeText());
    }

    @Test
    public void outerHtmlTest() throws IOException {
        TextNode tn = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        tn.outerHtmlHead(sb, 0, out);
        tn.outerHtmlTail(sb, 0, out);
        Assert.assertEquals("Test", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("Test");
        Assert.assertEquals("Test", tn.toString());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("Test");
        TextNode clone = tn.clone();
        Assert.assertEquals(tn.text(), clone.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("Test%20Text", true);
        Assert.assertEquals("Test Text", tn.text());
    }

}