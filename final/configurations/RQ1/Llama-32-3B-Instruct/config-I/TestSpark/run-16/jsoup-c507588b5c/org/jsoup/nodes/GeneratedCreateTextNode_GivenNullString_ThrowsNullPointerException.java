package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedCreateTextNode_GivenNullString_ThrowsNullPointerException {

    @Test
    public void createTextNode_GivenNullString_ThrowsNullPointerException() {
        String text = null;
        assertThrows(NullPointerException.class, () -> new TextNode(text));
    }

}