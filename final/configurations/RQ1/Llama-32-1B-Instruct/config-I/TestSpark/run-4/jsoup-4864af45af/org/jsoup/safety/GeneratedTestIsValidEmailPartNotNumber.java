package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestIsValidEmailPartNotNumber {

    @Test
    public void testIsValidEmailPartNotNumber() {
        AttributeUtil attributeUtil = new AttributeUtil();
        assertFalse(attributeUtil.isValidEmailPart("#anchor"));
        assertFalse(attributeUtil.isValidEmailPart("test#anchor"));
        assertFalse(attributeUtil.isValidEmailPart("#anchor#"));
        assertFalse(attributeUtil.isValidEmailPart("#anchor"));
    }

}