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

public class GeneratedText_setsCorrectValue {

    @Test
    public void text_setsCorrectValue() {
        TextNode textNode = new TextNode();
        textNode.text("newText");
        assertEquals("newText", textNode.coreValue());
    }

}