package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedNormaliseWhitespace_GivesNormalizedText {

    @Test
    public void normaliseWhitespace_GivesNormalizedText() {
        String text = "\t\tHello World!";
        TextNode textNode = new TextNode();
        String normalized = TextNode.normaliseWhitespace(text);
        Assert.assertEquals("   Hello World!", normalized);
    }

}