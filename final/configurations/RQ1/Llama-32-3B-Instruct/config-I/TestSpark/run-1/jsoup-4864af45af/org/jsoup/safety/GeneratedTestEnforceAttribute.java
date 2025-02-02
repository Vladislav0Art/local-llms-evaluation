package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestEnforceAttribute {

    @Test
    public void testEnforceAttribute() {
        // Given: enforce attribute for tag "img"
        Configuration configuration = new Configuration();
        TagName tagName = TagName.valueOf("img");
        configuration.enforcedAttributes.put(tagName, Map.of(
                AttributeKey.valueOf("src"), AttributeValue.valueOf("https://example.com/image.jpg")
        ));

        // When: checking if attribute is enforced
        boolean result1 = configuration.isEnforcedAttribute("img", "src");

        // Then: should return true
        assertTrue(result1);
    }

}