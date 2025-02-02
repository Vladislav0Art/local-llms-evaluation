package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_atStartReturnsCorrectNode {

    @Test
    public void splitText_atStartReturnsCorrectNode() throws IOException {
        Document document = new Document();
        Node parentNode = document.body();
        parentNode.appendChild(new TextNode("123"));
        TextNode textNode = (TextNode) parentNode.children().get(0);
        int offset = 0;
        TextNode result = textNode.splitText(offset);
        assertEquals("1", result.coreValue());
    }

}