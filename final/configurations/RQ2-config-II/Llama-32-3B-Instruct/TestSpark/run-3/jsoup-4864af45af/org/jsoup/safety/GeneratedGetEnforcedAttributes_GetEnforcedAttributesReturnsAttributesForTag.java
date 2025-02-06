package org.jsoup.safety;

public class GeneratedGetEnforcedAttributes_GetEnforcedAttributesReturnsAttributesForTag {

    @Test
    public void getEnforcedAttributes_GetEnforcedAttributesReturnsAttributesForTag() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addAttributes("img", "alt", "example-alt");
        assertEquals(1, ((Map<String, Set<String>>) safelist.getEnforcedAttributes("img")).size());
    }

}