package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestGet_WithKeyContainsWhitespaceReturnsOriginalAttribute {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testGet_WithKeyContainsWhitespaceReturnsOriginalAttribute() {
        Attribute attribute = attributes.add("test \n value", "value");
        String originalValue = attribute.getValue();
        assertEquals(originalValue, new Object[]{attribute, "value"});
    }

}