package org.jsoup.safety;

public class GeneratedBasic_removeEnforcedAttributeFromBasicSafelist {

    @Test
    public void basic_removeEnforcedAttributeFromBasicSafelist() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("img", "src", "https://example.com");
        safelist.removeEnforcedAttribute("img", "src");
        Attributes enforcedAttributes = safelist.getEnforcedAttributes("img");
        Set<String> expectedEnforcedAttributes = new HashSet<>();
        Assert.assertEquals(expectedEnforcedAttributes, enforcedAttributes);
    }

}