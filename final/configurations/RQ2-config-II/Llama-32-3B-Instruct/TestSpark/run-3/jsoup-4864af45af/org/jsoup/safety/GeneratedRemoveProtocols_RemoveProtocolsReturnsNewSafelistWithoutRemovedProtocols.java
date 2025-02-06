package org.jsoup.safety;

public class GeneratedRemoveProtocols_RemoveProtocolsReturnsNewSafelistWithoutRemovedProtocols {

    @Test
    public void removeProtocols_RemoveProtocolsReturnsNewSafelistWithoutRemovedProtocols() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addProtocols("img", "alt", "example-alt").removeProtocols("img");
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}