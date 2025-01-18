package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    // Test for constructor

    @Test
    public void TextNodeValidConstructorTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertEquals("test text", tn.text());
    }

    @Test
    public void TextProperlyReturnedTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertEquals("test text", tn.text());
    }

    @Test
    public void textNewTextSetTest() {
        final TextNode tn = new TextNode("old text");
        tn.text("new text");
        Assert.assertEquals("new text", tn.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test text");
        TextNode tnclone = tn.clone();
        Assert.assertNotSame(tn, tnclone);
        Assert.assertEquals(tn.text(), tnclone.text());
    }

}