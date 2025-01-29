package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedRemoveAttributes {

    @Test
    public void removeAttributes() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.removeAttributes("class");
        assertTrue(safelist.getEnforcedAttributes("img"));
    }

}