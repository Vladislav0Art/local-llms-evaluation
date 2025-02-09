package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNonEmptyTextTest {

    @Test
    public void textNonEmptyTextTest() {
        String text = "hello";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals("Text should be the same", text, textNode.text());
    }

}