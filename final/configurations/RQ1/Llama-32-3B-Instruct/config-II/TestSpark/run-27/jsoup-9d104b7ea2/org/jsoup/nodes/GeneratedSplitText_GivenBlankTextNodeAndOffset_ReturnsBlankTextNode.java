package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedSplitText_GivenBlankTextNodeAndOffset_ReturnsBlankTextNode {

    @Test
    public void splitText_GivenBlankTextNodeAndOffset_ReturnsBlankTextNode() {
        Document document = new Document();
        TextNode textNode = new TextNode("");
        Element parent = new Element(document, "parent");
        textNode.set parentNode (parent);
        TextNode tailNode = textNode.splitText(6);

        assertNotNull(tailNode);
        assertEquals("text", tailNode.nodeName());
        assertTrue(tailNode.isBlank());
    }

}