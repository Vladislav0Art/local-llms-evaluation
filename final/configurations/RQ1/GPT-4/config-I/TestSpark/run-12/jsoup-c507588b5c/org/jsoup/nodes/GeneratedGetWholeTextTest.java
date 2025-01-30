package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String sampleText = "Textnode test    with white spaces";
        TextNode node = new TextNode(sampleText);
        Assert.assertEquals(sampleText, node.getWholeText());
    }

}