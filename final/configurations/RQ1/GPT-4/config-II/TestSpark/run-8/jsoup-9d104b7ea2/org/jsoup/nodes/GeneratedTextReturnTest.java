package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextReturnTest {

    @Test
    public void textReturnTest() {
        TextNode textNode = new TextNode(" test ");
        Assert.assertEquals("test", textNode.text());
    }

}