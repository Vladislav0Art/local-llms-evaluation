package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTestTrue {

    @Test
    public void isBlankTestTrue() {
        TextNode tn = new TextNode("     ");
        Assert.assertTrue(tn.isBlank());
    }

}