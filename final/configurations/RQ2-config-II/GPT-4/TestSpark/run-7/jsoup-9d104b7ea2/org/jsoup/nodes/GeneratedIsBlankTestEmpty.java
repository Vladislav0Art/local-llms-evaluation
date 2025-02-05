package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTestEmpty {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void isBlankTestEmpty() {
        String text = "";
        TextNode textNode = new TextNode(text);
        Assert.assertTrue(textNode.isBlank());
    }

}