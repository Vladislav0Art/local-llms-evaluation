package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedIsBlank_ReturnsFalse {

    @Test
    public void isBlank_ReturnsFalse() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        Assert.assertFalse(textNode.isBlank());
    }

}