package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestNotPreserveRelativeLinks {

    @Test
    public void testNotPreserveRelativeLinks() {
        // Given: preserve relative links for tag "a" disabled
        Configuration configuration = new Configuration();
        TagName tagName = TagName.valueOf("a");
        configuration.preserveRelativeLinks = false;

        // When: checking if attribute has preserved relative link
        Element element = new Element();
        element.absUrl("href") = "https://example.com/link";
        Attribute attribute = new Attribute("href", "#anchor");
        boolean result4 = configuration.isSafeAttribute(tagName, element, attribute);

        // Then: should return false
        assertFalse(result4);
    }

}