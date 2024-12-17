package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedNodeName_TextNode_ReturnsCorrectNodeName {

    @Test
    public void nodeName_TextNode_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.nodeName().equals("#text"));
    }

}