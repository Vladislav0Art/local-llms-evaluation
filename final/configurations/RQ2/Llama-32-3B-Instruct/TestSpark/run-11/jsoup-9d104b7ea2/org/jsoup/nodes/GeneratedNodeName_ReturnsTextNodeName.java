package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedNodeName_ReturnsTextNodeName {

    @Test
    public void nodeName_ReturnsTextNodeName() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String text = "TextNode";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals("TextNode", textNode.nodeName());
    }

}