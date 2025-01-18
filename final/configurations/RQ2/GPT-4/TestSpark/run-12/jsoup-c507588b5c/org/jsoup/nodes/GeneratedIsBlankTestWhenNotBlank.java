package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankTestWhenNotBlank {

    @Test
    public void isBlankTestWhenNotBlank() {
        TextNode tn = new TextNode("Not blank");
        Assert.assertFalse(tn.isBlank());
    }

}