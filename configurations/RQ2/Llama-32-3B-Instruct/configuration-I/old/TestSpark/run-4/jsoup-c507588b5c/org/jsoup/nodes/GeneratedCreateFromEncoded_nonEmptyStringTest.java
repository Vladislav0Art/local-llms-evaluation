package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_nonEmptyStringTest {

    @Test
    public void createFromEncoded_nonEmptyStringTest() {
        String encodedText = "&lt;&gt;";
        TextNode textNode = new TextNode(encodedText);
        assertEquals("&lt;", textNode.text());
    }

}