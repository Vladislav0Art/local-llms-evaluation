package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextGetSetTest {

    @Test
    public void textGetSetTest() {
        TextNode textNode = new TextNode("Initial");
        Assert.assertEquals("Initial", textNode.text());

        textNode.text("Updated");
        Assert.assertEquals("Updated", textNode.text());
    }

}