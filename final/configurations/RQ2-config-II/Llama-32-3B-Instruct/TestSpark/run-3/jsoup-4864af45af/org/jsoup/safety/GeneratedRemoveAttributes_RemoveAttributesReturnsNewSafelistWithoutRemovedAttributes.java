package org.jsoup.safety;

public class GeneratedRemoveAttributes_RemoveAttributesReturnsNewSafelistWithoutRemovedAttributes {

    @Test
    public void removeAttributes_RemoveAttributesReturnsNewSafelistWithoutRemovedAttributes() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addAttributes("img", "alt", "example-alt").removeAttributes("img");
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}