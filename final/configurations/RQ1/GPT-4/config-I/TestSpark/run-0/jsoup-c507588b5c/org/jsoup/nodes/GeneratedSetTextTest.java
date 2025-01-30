package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Changed");
        Assert.assertEquals("Changed", textNode.getWholeText());
    }

}