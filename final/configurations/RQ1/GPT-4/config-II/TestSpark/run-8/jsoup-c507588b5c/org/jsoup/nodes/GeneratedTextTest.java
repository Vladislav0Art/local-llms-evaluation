package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
        Assert.assertEquals(textNode, textNode.text(text));
    }

}