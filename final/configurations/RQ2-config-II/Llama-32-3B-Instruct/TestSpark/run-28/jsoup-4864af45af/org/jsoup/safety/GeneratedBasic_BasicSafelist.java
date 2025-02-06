package org.jsoup.safety;

public class GeneratedBasic_BasicSafelist {

    @Test
    public void basic_BasicSafelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("img"));
    }

}