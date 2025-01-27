package org.jsoup.safety;

public class GeneratedTestRelaxed {

    @Test
    public void testRelaxed() {
        // Relaxed settings
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(true).removeProtocols("https://example.com").isRelaxed();
        assertTrue(result);
    }

}