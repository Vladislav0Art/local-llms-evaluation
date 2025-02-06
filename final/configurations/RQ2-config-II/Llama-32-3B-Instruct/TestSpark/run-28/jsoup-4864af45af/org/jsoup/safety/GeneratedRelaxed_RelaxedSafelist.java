package org.jsoup.safety;

public class GeneratedRelaxed_RelaxedSafelist {

    @Test
    public void relaxed_RelaxedSafelist() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("script", null, null));
    }

}