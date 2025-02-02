package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTextSetAndGetTextTest {

    @Test
    public void textSetAndGetTextTest() {
        TextNode node = new TextNode("");
        assertNotNull(node.text());
        assertEquals("", node.text());

        node.text("New test");
        assertEquals("New test", node.text());
    }

}