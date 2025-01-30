package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTestFalse {

    @Test
    public void isBlankTestFalse() {
        TextNode tn = new TextNode("Not blank");
        Assert.assertFalse(tn.isBlank());
    }

}