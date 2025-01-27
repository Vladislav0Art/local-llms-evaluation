package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedToString_ReturnsTextNodeAsString {

    @Test
    public void toString_ReturnsTextNodeAsString() {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String html = doc.outerHtml();
        TextNode textNode = doc.selectFirst("text-node");
        Assert.assertTrue(html.contains(textNode.toString()));
    }

}