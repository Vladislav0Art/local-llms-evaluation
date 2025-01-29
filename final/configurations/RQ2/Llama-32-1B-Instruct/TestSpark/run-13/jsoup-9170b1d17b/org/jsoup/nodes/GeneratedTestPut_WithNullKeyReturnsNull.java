package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestPut_WithNullKeyReturnsNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testPut_WithNullKeyReturnsNull() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String value = "value";
        attributes.put(null, value);
        assertEquals(value, new Object[]{null, value});
    }

}