package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedOuterHtmlHead_GivenEmptyTextNode_ReturnsEmptyString {

    @Test
    public void outerHtmlHead_GivenEmptyTextNode_ReturnsEmptyString() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        TextNode node = new TextNode("");
        Node child = mock(Node.class);
        when(node.parentNode()).thenReturn(child);
        String result = node.outerHtmlHead(accum, depth, out);
        assertEquals("", result);
    }

}