package org.jsoup.safety;

public class GeneratedAddAttributes_AddAttributesReturnsNewSafelistWithAddedAttributes {

    @Test
    public void addAttributes_AddAttributesReturnsNewSafelistWithAddedAttributes() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addAttributes("img", "alt", "example-alt");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

}