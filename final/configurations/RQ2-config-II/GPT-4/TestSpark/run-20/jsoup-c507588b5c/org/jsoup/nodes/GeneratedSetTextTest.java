package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Initial Text");
        String newText = "Updated Text";
        textNode.text(newText);
        Assert.assertEquals(newText, textNode.text());
    }

}