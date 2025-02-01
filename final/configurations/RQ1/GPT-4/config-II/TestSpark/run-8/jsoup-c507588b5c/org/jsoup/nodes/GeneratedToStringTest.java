package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.toString());
    }

}