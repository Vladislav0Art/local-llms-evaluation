package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedClone {

    @Test
    public void clone() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotSame(node, node.clone());
        assertEquals(text, node.text());
    }

}