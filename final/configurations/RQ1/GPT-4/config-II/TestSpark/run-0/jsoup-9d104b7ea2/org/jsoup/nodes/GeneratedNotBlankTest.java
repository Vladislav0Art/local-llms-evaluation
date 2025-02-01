package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNotBlankTest {

    @Test
    public void notBlankTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertFalse(textNode.isBlank());
    }

}