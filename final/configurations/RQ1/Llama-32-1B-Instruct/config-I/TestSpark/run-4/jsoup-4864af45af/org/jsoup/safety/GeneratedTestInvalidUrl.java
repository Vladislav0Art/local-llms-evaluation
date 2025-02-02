package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestInvalidUrl {

    @Test
    public void testInvalidUrl() {
        AttributeUtil attributeUtil = new AttributeUtil();
        assertFalse(AttributeUtil.isValidUrl("#anchor"));
        assertFalse(AttributeUtil.isValidUrl("http://example.com/path"));
        assertFalse(AttributeUtil.isValidUrl("https://www.example.com/"));
    }

}