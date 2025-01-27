package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedIsBlank_returnsFalse {

    @Test
    public void isBlank_returnsFalse() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        Assert.assertFalse(textNode.isBlank());
    }

}