package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedText_nonEmptyText_ReturnsNonEmptyString {

    @Test
    public void text_nonEmptyText_ReturnsNonEmptyString() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.text());
    }

}