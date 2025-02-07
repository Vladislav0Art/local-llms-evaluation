package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("img", "alt");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("alt"));
    }

}