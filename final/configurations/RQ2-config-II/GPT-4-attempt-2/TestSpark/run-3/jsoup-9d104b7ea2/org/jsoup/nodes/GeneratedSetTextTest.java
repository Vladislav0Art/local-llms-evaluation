package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("");
        node.text("newText");
        Assert.assertEquals("newText", node.text());
    }

}