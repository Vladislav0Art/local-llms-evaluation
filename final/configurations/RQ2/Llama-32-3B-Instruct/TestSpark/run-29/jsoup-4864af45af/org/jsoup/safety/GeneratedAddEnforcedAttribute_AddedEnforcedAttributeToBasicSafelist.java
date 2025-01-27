package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedAddEnforcedAttribute_AddedEnforcedAttributeToBasicSafelist {

    @Test
    public void addEnforcedAttribute_AddedEnforcedAttributeToBasicSafelist() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addEnforcedAttribute("form", "data-attr", "test-value");
        assertTrue(safelist.getEnforcedAttributes("form").containsKey(Validate.ATTR_DATA_ATTR));
    }

}