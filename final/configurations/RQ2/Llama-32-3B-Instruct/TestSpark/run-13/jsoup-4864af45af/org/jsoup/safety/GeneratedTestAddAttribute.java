package org.jsoup.safety;

public class GeneratedTestAddAttribute {

    @Test
    public void testAddAttribute() {
        // Adding an attribute
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(true).addProtocols("http://example.com").isRelaxed();
        assertFalse(result);
    }

}