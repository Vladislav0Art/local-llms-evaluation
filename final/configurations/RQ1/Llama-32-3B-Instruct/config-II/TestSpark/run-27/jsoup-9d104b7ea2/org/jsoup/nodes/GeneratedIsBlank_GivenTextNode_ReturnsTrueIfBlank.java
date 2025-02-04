package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedIsBlank_GivenTextNode_ReturnsTrueIfBlank {

    @Test
    public void isBlank_GivenTextNode_ReturnsTrueIfBlank() {
        Document document = new Document();
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}