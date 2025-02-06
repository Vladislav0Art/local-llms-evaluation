package org.jsoup.safety;

public class GeneratedAddProtocols_AddProtocolToSafelist {

    @Test
    public void addProtocols_AddProtocolToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addProtocols("img", "src", "https://example.com");
        assertTrue(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

}