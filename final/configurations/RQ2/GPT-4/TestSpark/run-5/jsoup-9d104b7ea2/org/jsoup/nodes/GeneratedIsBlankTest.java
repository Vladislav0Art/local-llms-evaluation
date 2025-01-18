package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String blankText = " ";
        TextNode node = new TextNode(blankText);
        Assert.assertTrue(node.isBlank());
    }

}