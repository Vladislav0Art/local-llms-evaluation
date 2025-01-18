package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedNotBlankTest {

    @Test
    public void notBlankTest() {
        String notBlankText = "text";
        TextNode node = new TextNode(notBlankText);
        Assert.assertFalse(node.isBlank());
    }

}