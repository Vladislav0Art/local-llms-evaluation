package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedOuterHtmlHead_GivenNotBlankTextNode_ReturnsCorrectString {

    @Test
    public void outerHtmlHead_GivenNotBlankTextNode_ReturnsCorrectString() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        String text = "Hello World";
        TextNode node = new TextNode(text);
        Node child = mock(Node.class);
        when(node.parentNode()).thenReturn(child);
        when(out.prettyPrint()).thenReturn(true);
        String result = node.outerHtmlHead(accum, depth, out);
        assertEquals("<p>Hello World</p>", result);
    }

}