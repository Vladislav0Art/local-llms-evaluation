package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestIsValidEmail {

    @Test
    public void testIsValidEmail() {
        AttributeUtil attributeUtil = new AttributeUtil();
        assertTrue(attributeUtil.isValidEmail("test@example.com"));
        assertTrue(attributeUtil.isValidEmail("valid_email@invalid_domain.com"));
    }

}