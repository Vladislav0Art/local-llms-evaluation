package org.jsoup.safety;

public class GeneratedAddProtocols_AddProtocolsReturnsNewSafelistWithAddedProtocols {

    @Test
    public void addProtocols_AddProtocolsReturnsNewSafelistWithAddedProtocols() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addProtocols("a", "href", "https://example.com");
        assertEquals(1, safelist.getEnforcedAttributes("a").size());
    }

}