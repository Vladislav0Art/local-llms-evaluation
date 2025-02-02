package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestEnforceAttributeNotDefined {

    @Test
    public void testEnforceAttributeNotDefined() {
        // Given: tag "div" without enforce attributes defined
        Configuration configuration = new Configuration();
        TagName tagName = TagName.valueOf("div");

        // When: checking if attribute is enforced
        boolean result2 = configuration.isEnforcedAttribute(tagName, "src");

        // Then: should return false
        assertFalse(result2);
    }

}