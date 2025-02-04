package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedSplitText_test {

    @Test
    public void splitText_test() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result1 = textNode.splitText(0);
        assertEquals("Hello World", result1.getWholeText());

        TextNode result2 = textNode.splitText(6);
        assertEquals("World", result2.getWholeText());
    }

}