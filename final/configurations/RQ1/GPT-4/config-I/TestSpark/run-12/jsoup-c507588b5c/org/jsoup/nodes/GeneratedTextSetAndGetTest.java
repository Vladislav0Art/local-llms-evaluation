package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetAndGetTest {

    @Test
    public void textSetAndGetTest() {
        String sampleText = "Textnode test";
        TextNode node = new TextNode("");
        node.text(sampleText);
        Assert.assertEquals(sampleText, node.getWholeText());
    }

}