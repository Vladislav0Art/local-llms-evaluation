package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGetWholeText_NonEmptyString_ReturnsNonEmptyString {

    @Test
    public void getWholeText_NonEmptyString_ReturnsNonEmptyString() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.getWholeText());
    }

}