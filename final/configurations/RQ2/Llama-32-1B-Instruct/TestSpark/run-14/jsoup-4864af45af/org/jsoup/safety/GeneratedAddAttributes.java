package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.addAttributes("class", "style");
        String[] attributes = {"id", "href"};
        safelist.addAttributes(attributes);
        assertNotNull(safelist.getEnforcedAttributes("img"));
    }

}