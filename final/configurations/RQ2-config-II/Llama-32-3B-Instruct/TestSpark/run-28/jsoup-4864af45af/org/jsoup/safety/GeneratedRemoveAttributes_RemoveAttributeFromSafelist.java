package org.jsoup.safety;

public class GeneratedRemoveAttributes_RemoveAttributeFromSafelist {

    @Test
    public void removeAttributes_RemoveAttributeFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeAttributes("img", "src");
        assertFalse(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

}