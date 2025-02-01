package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Text");
        TextNode tailNode = textNode.splitText(5);
        Assert.assertEquals("Split ", textNode.getWholeText());
        Assert.assertEquals("Text", tailNode.getWholeText());
    }

}