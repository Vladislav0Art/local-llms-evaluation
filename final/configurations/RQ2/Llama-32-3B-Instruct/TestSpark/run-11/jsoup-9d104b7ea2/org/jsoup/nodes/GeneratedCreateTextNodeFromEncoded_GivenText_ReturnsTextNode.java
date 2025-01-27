package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedCreateTextNodeFromEncoded_GivenText_ReturnsTextNode {

    @Test
    public void createTextNodeFromEncoded_GivenText_ReturnsTextNode() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String encodedText = "UTF-8";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals(encodedText, textNode.text());
    }

}