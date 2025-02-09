package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTextGetterAndSetterTest {

    @Test
    public void textGetterAndSetterTest() {
        TextNode textNode = new TextNode("old text");
        textNode.text("new text");
        Assert.assertEquals("new text", textNode.text());
    }

}