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

public class GeneratedNodeName_returnsCorrectString {

    @Test
    public void nodeName_returnsCorrectString() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

}