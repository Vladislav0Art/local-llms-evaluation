package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("a", "rel");
        assertFalse(safelist.getEnforcedAttributes("a").hasKey("rel"));
    }

}