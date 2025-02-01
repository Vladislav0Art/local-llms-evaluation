package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsNotBlankTest {

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("Test");
        Assert.assertEquals(false, node.isBlank());
    }

}