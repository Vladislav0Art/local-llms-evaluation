package org.jsoup.safety;

public class GeneratedRemoveEnforcedAttribute_RemoveEnforcedAttributeFromSafelist {

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeEnforcedAttribute("img", "src");
        assertFalse(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

}