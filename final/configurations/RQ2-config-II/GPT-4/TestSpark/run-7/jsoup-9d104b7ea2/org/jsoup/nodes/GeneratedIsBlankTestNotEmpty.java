package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTestNotEmpty {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void isBlankTestNotEmpty() {
        String text = "example text";
        TextNode textNode = new TextNode(text);
        Assert.assertFalse(textNode.isBlank());
    }

}