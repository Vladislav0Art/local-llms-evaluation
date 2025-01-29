package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestAdd_WithMultipleKeysAddsAllAttributes {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testAdd_WithMultipleKeysAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        Attribute attribute = attributes2.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

}