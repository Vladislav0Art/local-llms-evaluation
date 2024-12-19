package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() throws IOException {
        String encodedText = " &lt; ";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(" < ", textNode.text());
    }

}