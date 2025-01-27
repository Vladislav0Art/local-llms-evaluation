package org.jsoup.safety;

public class GeneratedTestSafelist {

    @Test
    public void testSafelist() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}