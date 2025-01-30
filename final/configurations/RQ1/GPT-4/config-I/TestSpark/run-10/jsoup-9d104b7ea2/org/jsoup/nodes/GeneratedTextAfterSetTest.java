package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextAfterSetTest {

    @Test
    public void textAfterSetTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertEquals("New Node Text", textNode.text("New Node Text").text());
    }

}