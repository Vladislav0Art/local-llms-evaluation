package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals(true, textNode.isBlank());

        final String text = "sample text";
        textNode = new TextNode(text);
        Assert.assertEquals(false, textNode.isBlank());
    }

}