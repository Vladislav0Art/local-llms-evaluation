package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&lt;p&gt;Paragraphe.&lt;/p&gt;", false);
        assertEquals("<p>Paragraphe.</p>", node.getWholeText());
    }

}