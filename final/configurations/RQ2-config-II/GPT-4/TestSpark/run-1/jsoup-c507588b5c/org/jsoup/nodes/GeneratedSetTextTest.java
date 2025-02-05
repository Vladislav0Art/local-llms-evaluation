package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        String text = "New TextNode Test";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        Assert.assertEquals(text, textNode.text());
    }

}