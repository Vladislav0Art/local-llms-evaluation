package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetIgnoreCase_WithNonNullableValueReturnsEmptyString {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testGetIgnoreCase_WithNonNullableValueReturnsEmptyString() {
        Attribute attribute = attributes.add("test", "value");
        assertEquals("", attribute.getValue());
    }

}