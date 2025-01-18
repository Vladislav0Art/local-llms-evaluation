package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "wholeText";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.getWholeText());
    }

}