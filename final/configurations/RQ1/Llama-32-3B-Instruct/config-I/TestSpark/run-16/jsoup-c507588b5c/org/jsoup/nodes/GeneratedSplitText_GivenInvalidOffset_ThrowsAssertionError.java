package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedSplitText_GivenInvalidOffset_ThrowsAssertionError {

    @Test
    public void splitText_GivenInvalidOffset_ThrowsAssertionError() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 7;
        assertThrows(AssertionError.class, () -> node.splitText(offset));
    }

}