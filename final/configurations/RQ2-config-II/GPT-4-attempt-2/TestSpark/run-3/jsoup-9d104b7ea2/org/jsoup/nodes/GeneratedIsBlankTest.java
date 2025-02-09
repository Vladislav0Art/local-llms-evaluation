package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(" ");
        Assert.assertTrue(node.isBlank());
    }

}