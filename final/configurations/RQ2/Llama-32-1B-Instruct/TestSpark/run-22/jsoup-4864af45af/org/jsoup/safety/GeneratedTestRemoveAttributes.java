package org.jsoup.safety;

public class GeneratedTestRemoveAttributes {

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();
        safelist.removeAttributes("tag");
        assertEquals("", safelist.getEnforcedAttributes("a"));
    }

}