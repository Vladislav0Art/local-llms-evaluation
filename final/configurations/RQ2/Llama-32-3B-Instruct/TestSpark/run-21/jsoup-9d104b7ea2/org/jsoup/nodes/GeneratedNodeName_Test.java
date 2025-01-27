package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeName_Test {

    public String trim(String str) {
        return str.trim();
    }

    @Test
    public void nodeName_Test() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

}