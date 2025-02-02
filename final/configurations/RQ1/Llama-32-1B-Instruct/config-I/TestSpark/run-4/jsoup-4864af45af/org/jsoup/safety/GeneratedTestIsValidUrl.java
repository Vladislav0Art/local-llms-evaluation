package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestIsValidUrl {

    @Test
    public void testIsValidUrl() {
        AttributeUtil attributeUtil = new AttributeUtil();
        assertTrue(attributeUtil.isValidUrl("http://example.com"));
        assertTrue(attributeUtil.isValidUrl("https://www.example.com/path"));
    }

}