package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test case");
        Assert.assertEquals("Test case", textNode.toString());
    }

}