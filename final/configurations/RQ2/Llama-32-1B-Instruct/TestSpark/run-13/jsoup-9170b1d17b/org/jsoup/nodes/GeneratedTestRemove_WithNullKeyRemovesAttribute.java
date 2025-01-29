package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestRemove_WithNullKeyRemovesAttribute {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testRemove_WithNullKeyRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String value = "value";
        attributes.remove(null);
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

}