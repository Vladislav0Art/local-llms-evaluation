package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestGet_WithoutKeyReturnsEmptyString {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testGet_WithoutKeyReturnsEmptyString() {
        Attribute attribute = attributes.add(null, "value");
        assertEquals("", attribute.getValue());
    }

}