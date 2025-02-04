package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedCreateFromEncodedText_GivenEncodedText_ReturnsTextNodeWithUnescapedText {

    @Test
    public void createFromEncodedText_GivenEncodedText_ReturnsTextNodeWithUnescapedText() throws Exception {
        String encodedText = "&#60;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<", node.text());
    }

}