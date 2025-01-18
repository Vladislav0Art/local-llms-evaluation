package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextTestWhenValueChange {

    @Test
    public void textTestWhenValueChange() {
        TextNode tn = new TextNode("Test");
        tn.text("Test changed");
        Assert.assertEquals("Test changed", tn.text());
    }

}