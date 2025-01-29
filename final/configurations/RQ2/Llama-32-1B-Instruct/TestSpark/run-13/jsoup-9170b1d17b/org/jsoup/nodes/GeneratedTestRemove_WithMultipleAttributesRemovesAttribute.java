package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestRemove_WithMultipleAttributesRemovesAttribute {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testRemove_WithMultipleAttributesRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        attributes.remove("key1");
        Attribute attribute = attributes.get("key2");
        assertEquals(0, attribute.getValue().length());
    }

}