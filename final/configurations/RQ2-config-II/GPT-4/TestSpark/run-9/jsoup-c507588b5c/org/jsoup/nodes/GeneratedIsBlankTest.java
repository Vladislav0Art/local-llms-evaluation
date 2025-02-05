package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("   ");
        Assert.assertEquals(true, node.isBlank());

        node = new TextNode("non-blank");
        Assert.assertEquals(false, node.isBlank());
    }

}