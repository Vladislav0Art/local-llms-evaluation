package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedIsBlank RETURNSTrueWhenTextIsBlank {

    @Test
    public void isBlank

    RETURNSTrueWhenTextIsBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        Assert.assertTrue(textNode.isBlank());
    }

}