package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedBasicRemoveEnforcedAttributesNotSafe {

    @Test
    public void basicRemoveEnforcedAttributesNotSafe() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("alt")));
    }

}