package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTestPut_WithKeywordEqualsValueReturnsNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testPut_WithKeywordEqualsValueReturnsNull() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String key = "key";
        String value = null;
        attributes.put(key, value);
        assertEquals(null, attributes.get(key));
    }

}