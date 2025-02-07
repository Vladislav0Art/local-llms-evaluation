package org.jsoup.safety;

public class GeneratedAddEnforcedAttribute_SafeAttribute {

    @Test
    public void addEnforcedAttribute_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        result.addEnforcedAttribute(tagName, "href", "https://example.com");
        assertEquals("href=https://example.com", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

}