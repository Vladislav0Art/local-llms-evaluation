package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.mockito.ArgumentMatchers.anyString;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.text());
        Assert.assertEquals("st", splitTextNode.text());
    }

}