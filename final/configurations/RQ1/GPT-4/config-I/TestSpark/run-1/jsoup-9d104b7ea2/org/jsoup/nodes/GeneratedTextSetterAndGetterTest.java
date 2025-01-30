package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetterAndGetterTest {

    @Test
    public void textSetterAndGetterTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.text());
        textNode.text("Setter test");
        Assert.assertEquals("Setter test", textNode.text());
    }

}