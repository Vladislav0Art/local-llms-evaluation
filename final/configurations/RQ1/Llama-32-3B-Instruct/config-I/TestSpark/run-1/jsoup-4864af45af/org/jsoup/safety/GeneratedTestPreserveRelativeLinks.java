package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestPreserveRelativeLinks {

    @Test
    public void testPreserveRelativeLinks() {
        // Given: preserve relative links for tag "a"
        Configuration configuration = new Configuration();
        TagName tagName = TagName.valueOf("a");
        configuration.preserveRelativeLinks = true;

        // When: checking if attribute has preserved relative link
        Element element = new Element();
        element.absUrl("href") = "https://example.com/link";
        Attribute attribute = new Attribute("href", "#anchor");
        boolean result3 = configuration.isSafeAttribute(tagName, element, attribute);

        // Then: should return true
        assertTrue(result3);
    }

}