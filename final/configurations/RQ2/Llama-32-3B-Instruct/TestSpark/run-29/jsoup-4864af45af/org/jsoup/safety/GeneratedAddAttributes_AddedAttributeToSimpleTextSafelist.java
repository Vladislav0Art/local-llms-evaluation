package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedAddAttributes_AddedAttributeToSimpleTextSafelist {

    @Test
    public void addAttributes_AddedAttributeToSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        safelist = safelist.addAttributes("p", "data-test", "test-attribute");
        assertTrue(safelist.getEnforcedAttributes("p").containsKey(Validate.ATTR_DATA_TEST));
    }

}