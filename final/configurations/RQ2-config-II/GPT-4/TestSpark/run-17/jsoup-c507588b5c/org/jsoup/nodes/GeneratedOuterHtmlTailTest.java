package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws Exception {
        TextNode tn = new TextNode("Some text");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document("").outputSettings();
        tn.outerHtmlTail(sb, 0, outputSettings);
        assertEquals("", sb.toString());
    }

}