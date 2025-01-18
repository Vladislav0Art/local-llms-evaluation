package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankTestWhenBlank {

    @Test
    public void isBlankTestWhenBlank() {
        TextNode tn = new TextNode("   ");
        Assert.assertTrue(tn.isBlank());
    }

}