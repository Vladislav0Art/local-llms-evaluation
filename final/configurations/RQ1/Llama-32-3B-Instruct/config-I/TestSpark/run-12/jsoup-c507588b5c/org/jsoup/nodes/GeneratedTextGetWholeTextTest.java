package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTextGetWholeTextTest {

    @Test
    public void textGetWholeTextTest() {
        TextNode node = new TextNode("   ");
        String result = node.getWholeText();
        assertEquals("   ", result);

        TextNode node2 = new TextNode("This is a test");
        String result2 = node2.getWholeText();
        assertEquals("This is a test", result2);
    }

}