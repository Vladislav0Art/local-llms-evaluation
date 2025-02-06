package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedBasicAddEnforcedAttributesIsSafe {

    @Test
    public void basicAddEnforcedAttributesIsSafe() {
        Safelist safelist = Safelist.basic();
        safelist.addEnforcedAttribute("img", "alt", "myValue");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("alt", "myValue")));
    }

}