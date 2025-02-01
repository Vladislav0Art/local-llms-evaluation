package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.getWholeText());
    }

}