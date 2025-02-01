package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test case");
        Assert.assertEquals("Test case", textNode.getWholeText());
    }

}