package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestNormaliseWhitespace_SimpleTextWithNoLeadingSpaces {

    public static Document getDocument() {
        return new Document();
    }

    @Test
    public void testNormaliseWhitespace_SimpleTextWithNoLeadingSpaces() {
        Node node = TextNode.createNew();
        String normalisedValue = TextNode.normaliseWhitespace(node).getValue();
        assertEquals("", normalisedValue);
    }

}