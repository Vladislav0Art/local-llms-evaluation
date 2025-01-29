package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestPut_WithMultipleAttributesAddsAllAttributes {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testPut_WithMultipleAttributesAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.put("key1", null);
        attributes2.put("key1", "value11");
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

}