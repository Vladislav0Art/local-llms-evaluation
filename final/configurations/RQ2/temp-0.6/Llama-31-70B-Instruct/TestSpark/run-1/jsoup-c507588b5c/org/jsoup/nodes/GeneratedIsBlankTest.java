package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        boolean isBlank = textNode.isBlank();

        Assert.assertTrue(isBlank);
    }

}