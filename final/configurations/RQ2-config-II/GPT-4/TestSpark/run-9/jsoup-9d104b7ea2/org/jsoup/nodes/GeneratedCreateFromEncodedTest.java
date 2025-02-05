package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;div&gt;Test text&lt;/div&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText, false);

        assertEquals("<div>Test text</div>", node.getWholeText());
    }

}