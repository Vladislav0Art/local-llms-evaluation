package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNewTextTest {

    @Test
    public void textNewTextTest() {
        String text = "test";
        String newText = "new test";
        TextNode node = new TextNode(text);
        node.text(newText);
        Assert.assertEquals(newText, node.text());
    }

}