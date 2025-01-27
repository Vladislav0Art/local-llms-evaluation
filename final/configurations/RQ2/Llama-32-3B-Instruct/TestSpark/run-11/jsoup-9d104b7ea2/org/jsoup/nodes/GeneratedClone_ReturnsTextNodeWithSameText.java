package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedClone_ReturnsTextNodeWithSameText {

    @Test
    public void clone_ReturnsTextNodeWithSameText() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String text = "Hello World!";
        TextNode textNode = new TextNode();
        textNode.text(text);
        TextNode cloned = new TextNode().clone(textNode);
        Assert.assertEquals(text, cloned.text());
    }

}