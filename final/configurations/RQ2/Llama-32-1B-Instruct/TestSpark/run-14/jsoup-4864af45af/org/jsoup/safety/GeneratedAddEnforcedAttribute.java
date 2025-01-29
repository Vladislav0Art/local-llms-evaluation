package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.simpleText();
        safelist.addEnforcedAttribute("a", "href", "#top");
        String attribute = "href";
        String value = "top";
        safelist.addEnforcedAttribute(attribute, value);
        assertNotNull(safelist.getEnforcedAttributes("a"));
    }

}