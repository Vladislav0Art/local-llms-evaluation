package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode tailTextNode = textNode.splitText(6);
        Assert.assertEquals("sample", textNode.text());
        Assert.assertEquals(" text", tailTextNode.text());
    }

}