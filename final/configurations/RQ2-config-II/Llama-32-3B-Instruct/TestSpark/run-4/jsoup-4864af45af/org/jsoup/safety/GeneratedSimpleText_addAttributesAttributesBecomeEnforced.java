package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedSimpleText_addAttributesAttributesBecomeEnforced {

    @Test
    public void simpleText_addAttributesAttributesBecomeEnforced() {
        Safelist safelist = Safelist.simpleText();
        Safelist newSafelist = safelist.addAttributes("div", "class", "test");
        assertTrue(newSafelist.getEnforcedAttributes("div").containsKey("class"));
    }

}