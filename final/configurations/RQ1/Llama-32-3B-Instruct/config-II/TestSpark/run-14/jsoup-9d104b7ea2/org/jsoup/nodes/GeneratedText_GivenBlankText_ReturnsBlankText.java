package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedText_GivenBlankText_ReturnsBlankText {

    @Test
    public void text_GivenBlankText_ReturnsBlankText() {
        TextNode node = new TextNode("");
        assertTrue(node.text().isEmpty());
    }

}