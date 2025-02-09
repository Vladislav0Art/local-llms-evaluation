package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.getWholeText());
    }

}