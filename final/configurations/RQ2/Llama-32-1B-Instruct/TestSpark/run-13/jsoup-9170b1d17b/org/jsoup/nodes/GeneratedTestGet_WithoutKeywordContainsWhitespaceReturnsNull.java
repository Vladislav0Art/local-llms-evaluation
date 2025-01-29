package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestGet_WithoutKeywordContainsWhitespaceReturnsNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testGet_WithoutKeywordContainsWhitespaceReturnsNull() {
        Attribute attribute = attributes.add("test\n value", null);
        assertEquals(null, attribute.getValue());
    }

}