package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedText_setsText {

    @Test
    public void text_setsText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode();
        textNode.text(text);
        Assert.assertEquals(text, textNode.text());
    }

}