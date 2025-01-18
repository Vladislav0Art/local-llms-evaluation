package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitText_ValidOffset_Test {

    @Test
    public void splitText_ValidOffset_Test() {
        TextNode textNode = new TextNode("testText");
        TextNode splittedTextNode = textNode.splitText(4);
        Assert.assertEquals("test", splittedTextNode.getWholeText());
    }

}