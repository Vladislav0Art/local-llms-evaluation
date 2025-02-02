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

public class GeneratedSplitText_atEndReturnsBlankNode {

    @Test
    public void splitText_atEndReturnsBlankNode() throws IOException {
        Document document = new Document();
        Node parentNode = document.body();
        parentNode.appendChild(new TextNode(""));
        parentNode.appendChild(new TextNode("123"));
        TextNode textNode = (TextNode) parentNode.children().get(1);
        int offset = textNode.coreValue().length();
        TextNode result = textNode.splitText(offset);
        assertTrue(result.isBlank());
    }

}