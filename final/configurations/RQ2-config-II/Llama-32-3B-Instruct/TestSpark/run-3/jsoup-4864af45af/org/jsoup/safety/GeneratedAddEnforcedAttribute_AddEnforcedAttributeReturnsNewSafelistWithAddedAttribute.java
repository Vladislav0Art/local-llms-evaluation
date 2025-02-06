package org.jsoup.safety;

public class GeneratedAddEnforcedAttribute_AddEnforcedAttributeReturnsNewSafelistWithAddedAttribute {

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeReturnsNewSafelistWithAddedAttribute() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addEnforcedAttribute("a", "href", "https://example.com");
        assertEquals(1, safelist.getEnforcedAttributes("a").size());
    }

}