package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestIsValidEmailPart {

    @Test
    public void testIsValidEmailPart() {
        AttributeUtil attributeUtil = new AttributeUtil();
        assertTrue(attributeUtil.isNumber("#anchor"));
        assertTrue(attributeUtil.isNumber("test#anchor"));
        assertTrue(attributeUtil.isNumber("#anchor#"));
        assertTrue(attributeUtil.isNumber("#anchor"));
        assertFalse(attributeUtil.isNumber(""));
    }

}