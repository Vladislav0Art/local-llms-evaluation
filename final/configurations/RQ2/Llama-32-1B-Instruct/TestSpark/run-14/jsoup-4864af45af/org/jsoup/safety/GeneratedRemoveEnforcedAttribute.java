package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.simpleText();
        String tag = "a";
        String attribute = "href";
        safelist.removeEnforcedAttribute(tag, attribute);
        assertFalse(safelist.isSafeTag(tag));
    }

}