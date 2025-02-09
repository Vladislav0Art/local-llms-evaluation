package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode encodedTextNode = TextNode.createFromEncoded("Sample Encoded Text", false);
        assertEquals("Sample Encoded Text", encodedTextNode.text());
    }

}