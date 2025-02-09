package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("Test");
        Assert.assertEquals("Test", tn.toString());
    }

}