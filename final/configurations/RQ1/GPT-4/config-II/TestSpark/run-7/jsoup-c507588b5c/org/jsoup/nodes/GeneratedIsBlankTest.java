package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("    ");
        Assert.assertEquals(true, node.isBlank());
    }

}