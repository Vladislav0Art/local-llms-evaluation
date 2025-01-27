package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedIsBlank_ReturnsTrueWhenTextIsBlank {

    @Test
    public void isBlank_ReturnsTrueWhenTextIsBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        Assert.assertTrue(textNode.isBlank());
    }

}