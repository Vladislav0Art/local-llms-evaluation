package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&#xB6;"; // paragraph symbol in HTML
        TextNode node = TextNode.createFromEncoded(encodedText, null);
        assertEquals("\u00B6", node.text());
    }

}