package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitTextTest {

    @Test
    public void SplitTextTest() {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(4);
        Assert.assertEquals("test", textNode.text());
        Assert.assertEquals(" text", splitTextNode.text());
    }

}