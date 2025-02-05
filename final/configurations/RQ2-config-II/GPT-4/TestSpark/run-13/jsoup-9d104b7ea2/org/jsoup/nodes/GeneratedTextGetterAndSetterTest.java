package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextGetterAndSetterTest {

    @Test
    public void textGetterAndSetterTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Changed");
        Assert.assertEquals("Changed", textNode.text());
    }

}