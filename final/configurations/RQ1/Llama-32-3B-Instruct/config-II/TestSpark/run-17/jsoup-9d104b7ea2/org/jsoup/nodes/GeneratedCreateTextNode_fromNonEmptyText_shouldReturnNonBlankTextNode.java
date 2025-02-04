package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedCreateTextNode_fromNonEmptyText_shouldReturnNonBlankTextNode {

    public Node createTextNode(String text) {
        Document doc = new Document();
        Element parent = doc.createElement("root");
        doc.appendChild(parent);
        return doc.body().append(text).firstChild();
    }

    @Test
    public void createTextNode_fromNonEmptyText_shouldReturnNonBlankTextNode() {
        String text = "   ";
        TextNode node = TextNode.createFromEncoded(text);
        assertFalse(node.isBlank());
    }

}