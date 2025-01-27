package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedCreateTextNode_ReturnsTextNode {

    @Test
    public void createTextNode_ReturnsTextNode() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String text = "UTF-8";
        TextNode textNode = doc.createTextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

}