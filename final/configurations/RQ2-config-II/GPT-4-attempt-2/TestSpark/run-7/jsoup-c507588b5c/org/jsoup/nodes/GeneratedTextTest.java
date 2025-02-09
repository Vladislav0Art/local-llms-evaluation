package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode tn = new TextNode("Old");
        tn.text("New");
        Assert.assertEquals("New", tn.text());
    }

}