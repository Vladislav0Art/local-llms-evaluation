package org.jsoup.safety;

public class GeneratedRemoveProtocols_RemoveProtocolFromSafelist {

    @Test
    public void removeProtocols_RemoveProtocolFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeProtocols("img", "src", null);
        assertFalse(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

}