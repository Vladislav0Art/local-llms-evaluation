package org.jsoup.safety;

public class GeneratedTestAddProtocols {

    @Test
    public void testAddProtocols() {
        // Adding protocols
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        boolean result = safelist.preserveRelativeLinks(true).addProtocols("https://example.com").isRelaxed();
        assertTrue(result);
    }

}