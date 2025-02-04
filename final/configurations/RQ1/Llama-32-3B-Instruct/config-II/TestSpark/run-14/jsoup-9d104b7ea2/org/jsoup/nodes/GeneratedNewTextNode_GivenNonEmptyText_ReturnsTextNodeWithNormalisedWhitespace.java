package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedNewTextNode_GivenNonEmptyText_ReturnsTextNodeWithNormalisedWhitespace {

    @Test
    public void newTextNode_GivenNonEmptyText_ReturnsTextNodeWithNormalisedWhitespace() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals(" ", node.text());
    }

}