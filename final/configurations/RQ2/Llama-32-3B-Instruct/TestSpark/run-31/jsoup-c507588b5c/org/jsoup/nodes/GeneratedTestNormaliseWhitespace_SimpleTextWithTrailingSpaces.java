package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestNormaliseWhitespace_SimpleTextWithTrailingSpaces {

    public static Document getDocument() {
        return new Document();
    }

    @Test
    public void testNormaliseWhitespace_SimpleTextWithTrailingSpaces() {
        Node node = TextNode.createNew("Hello ");
        String normalisedValue = TextNode.normaliseWhitespace(node).getValue();
        assertEquals("Hello", normalisedValue);
    }

}