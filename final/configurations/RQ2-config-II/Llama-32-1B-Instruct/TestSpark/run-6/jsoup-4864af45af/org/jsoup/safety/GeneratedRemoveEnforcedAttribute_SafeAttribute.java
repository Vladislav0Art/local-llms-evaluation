package org.jsoup.safety;

public class GeneratedRemoveEnforcedAttribute_SafeAttribute {

    @Test
    public void removeEnforcedAttribute_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        assertTrue(result.removeEnforcedAttribute(tagName, "href"));
        assertEquals("", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

}