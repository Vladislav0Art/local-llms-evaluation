package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedNodeName RETURNSNodeName {

    @Test
    public void nodeName

    RETURNSNodeName() {
        Node node = new Node();
        TextNode textNode = new TextNode("TextNode");
        Assert.assertEquals(node.nodeName(), "TextNode");
    }

}