package org.jsoup.safety;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();
        safelist.removeTags("tag");
        assertEquals("", safelist.getEnforcedAttributes("a"));
    }

}