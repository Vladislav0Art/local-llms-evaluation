package org.jsoup.safety;

public class GeneratedBasic_addEnforcedAttributesToBasicSafelist {

    @Test
    public void basic_addEnforcedAttributesToBasicSafelist() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("img", "src", "https://example.com");
        Attributes enforcedAttributes = safelist.getEnforcedAttributes("img");
        Set<String> expectedEnforcedAttributes = new HashSet<>(Arrays.asList("src"));
        Assert.assertEquals(expectedEnforcedAttributes, enforcedAttributes);
    }

}