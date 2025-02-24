package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Some text");
        String wholeText = textNode.getWholeText();

        Assert.assertEquals("Some text", wholeText);
    }

}