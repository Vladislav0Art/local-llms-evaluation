package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        String text = "Test Text";
        TextNode node = new TextNode("");
        node.text(text);
        Assert.assertEquals(text, node.text());
    }

}