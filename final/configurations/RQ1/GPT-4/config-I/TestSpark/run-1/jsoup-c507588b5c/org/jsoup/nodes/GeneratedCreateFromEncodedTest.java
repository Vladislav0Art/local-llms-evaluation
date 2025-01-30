package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String htmlEncodedText = "&lt;s&gt;sample&lt;/s&gt;";
        TextNode node = TextNode.createFromEncoded(htmlEncodedText);
        assertEquals("<s>sample</s>", node.getWholeText());
    }

}