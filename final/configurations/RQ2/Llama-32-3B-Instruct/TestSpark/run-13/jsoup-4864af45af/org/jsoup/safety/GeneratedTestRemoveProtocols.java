package org.jsoup.safety;

public class GeneratedTestRemoveProtocols {

    @Test
    public void testRemoveProtocols() {
        // Removing protocols
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        boolean result = safelist.preserveRelativeLinks(true).removeProtocols("https://example.com").isRelaxed();
        assertFalse(result);
    }

}