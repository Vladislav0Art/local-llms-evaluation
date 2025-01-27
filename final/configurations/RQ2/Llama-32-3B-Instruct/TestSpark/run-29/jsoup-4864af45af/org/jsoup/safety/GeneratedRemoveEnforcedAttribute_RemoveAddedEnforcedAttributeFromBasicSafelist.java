package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveEnforcedAttribute_RemoveAddedEnforcedAttributeFromBasicSafelist {

    @Test
    public void removeEnforcedAttribute_RemoveAddedEnforcedAttributeFromBasicSafelist() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addEnforcedAttribute("form", "data-attr", "test-value");
        safelist = safelist.removeEnforcedAttribute("form", "data-attr");
        assertTrue(safelist.getEnforcedAttributes("form").isEmpty());
    }

}