package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedSplitTextNormalTest {

    @Test
    public void splitTextNormalTest() {
        TextNode tNode = new TextNode("12345");
        TextNode splitNode = tNode.splitText(2);
        Assert.assertEquals("12", splitNode.text());
    }

}