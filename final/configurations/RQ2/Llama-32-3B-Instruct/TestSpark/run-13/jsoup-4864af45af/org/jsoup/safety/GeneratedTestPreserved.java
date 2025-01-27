package org.jsoup.safety;

public class GeneratedTestPreserved {

    @Test
    public void testPreserved() {
        // Preserved settings
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(false).removeProtocols("https://example.com").isRelaxed();
        assertFalse(result);
    }

}