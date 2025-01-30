package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String sampleText = "Textnode test";
        TextNode node = new TextNode(sampleText);
        Assert.assertEquals(sampleText, node.text());
    }

}