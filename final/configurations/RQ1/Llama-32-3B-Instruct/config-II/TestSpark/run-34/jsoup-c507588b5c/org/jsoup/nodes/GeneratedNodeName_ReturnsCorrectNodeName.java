package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}