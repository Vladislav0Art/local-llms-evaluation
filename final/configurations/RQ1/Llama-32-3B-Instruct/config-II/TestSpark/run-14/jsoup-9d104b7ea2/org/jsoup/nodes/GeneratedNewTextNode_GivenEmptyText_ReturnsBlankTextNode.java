package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedNewTextNode_GivenEmptyText_ReturnsBlankTextNode {

    @Test
    public void newTextNode_GivenEmptyText_ReturnsBlankTextNode() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.text().isEmpty());
    }

}