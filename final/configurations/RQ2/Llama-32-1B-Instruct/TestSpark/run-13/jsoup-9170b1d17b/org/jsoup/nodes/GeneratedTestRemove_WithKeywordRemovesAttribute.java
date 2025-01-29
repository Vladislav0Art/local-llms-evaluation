package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestRemove_WithKeywordRemovesAttribute {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testRemove_WithKeywordRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String key = "key";
        String value = null;
        attributes.remove(key);
        Attribute attribute = attributes.get(key);
        assertEquals(0, attribute.getValue().length());
    }

}