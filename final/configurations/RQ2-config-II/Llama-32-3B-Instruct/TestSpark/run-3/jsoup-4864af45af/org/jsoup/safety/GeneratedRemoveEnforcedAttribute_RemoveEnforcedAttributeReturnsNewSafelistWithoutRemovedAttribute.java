package org.jsoup.safety;

public class GeneratedRemoveEnforcedAttribute_RemoveEnforcedAttributeReturnsNewSafelistWithoutRemovedAttribute {

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeReturnsNewSafelistWithoutRemovedAttribute() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addEnforcedAttribute("a", "href", "https://example.com").removeEnforcedAttribute("a");
        assertEquals(0, safelist.getEnforcedAttributes("a").size());
    }

}