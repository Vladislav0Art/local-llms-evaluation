package org.jsoup.safety;

public class GeneratedTestRemoveEnforcedAttribute {

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();
        safelist.removeEnforcedAttribute("tag");
        assertEquals("", safelist.getEnforcedAttributes("a"));
    }

}