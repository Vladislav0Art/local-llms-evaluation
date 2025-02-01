package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTrueTest {

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
    }

}