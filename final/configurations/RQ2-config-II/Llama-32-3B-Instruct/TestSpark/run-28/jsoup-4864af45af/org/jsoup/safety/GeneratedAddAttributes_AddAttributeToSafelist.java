package org.jsoup.safety;

public class GeneratedAddAttributes_AddAttributeToSafelist {

    @Test
    public void addAttributes_AddAttributeToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist1.getEnforcedAttributes("a").containsKey("href"));
    }

}