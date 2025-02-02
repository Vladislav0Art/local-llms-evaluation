package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("   ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("Hello World");
        assertFalse(node3.isBlank());
    }

}