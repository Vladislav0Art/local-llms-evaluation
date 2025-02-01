package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;Sample text&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<Sample text>", textNode.getWholeText());
    }

}