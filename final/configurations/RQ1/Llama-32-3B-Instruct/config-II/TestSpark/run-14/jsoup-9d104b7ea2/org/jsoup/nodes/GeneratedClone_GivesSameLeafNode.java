package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedClone_GivesSameLeafNode {

    @Test
    public void clone_GivesSameLeafNode() {
        String text = "Hello World";
        LeafNode node = new LeafNode(text);
        TextNode cloned = (TextNode) node.clone();
        assertEquals(text, cloned.text());
    }

}