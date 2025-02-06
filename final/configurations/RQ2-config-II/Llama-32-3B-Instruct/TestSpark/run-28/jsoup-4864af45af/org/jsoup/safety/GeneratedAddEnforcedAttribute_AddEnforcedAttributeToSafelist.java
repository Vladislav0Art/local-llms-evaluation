package org.jsoup.safety;

public class GeneratedAddEnforcedAttribute_AddEnforcedAttributeToSafelist {

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertTrue(safelist1.getEnforcedAttributes("a").containsKey("href"));
    }

}