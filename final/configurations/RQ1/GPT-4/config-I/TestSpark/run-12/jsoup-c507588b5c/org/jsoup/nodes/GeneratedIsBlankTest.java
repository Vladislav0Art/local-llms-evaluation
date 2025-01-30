package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String sampleText = "";
        TextNode node = new TextNode(sampleText);
        Assert.assertTrue(node.isBlank());

        sampleText = "     ";
        node = new TextNode(sampleText);
        Assert.assertTrue(node.isBlank());

        sampleText = "Test";
        node = new TextNode(sampleText);
        Assert.assertFalse(node.isBlank());
    }

}