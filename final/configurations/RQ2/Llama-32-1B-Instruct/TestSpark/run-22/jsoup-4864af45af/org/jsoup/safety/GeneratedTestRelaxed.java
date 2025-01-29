package org.jsoup.safety;

public class GeneratedTestRelaxed {

    @Test
    public void testRelaxed() {
        Safelist relaxed = org.jsoup.safety.Safelist.relaxed();
        assertEquals("relaxed", relaxed.getEnforcedAttributes("a"));
    }

}