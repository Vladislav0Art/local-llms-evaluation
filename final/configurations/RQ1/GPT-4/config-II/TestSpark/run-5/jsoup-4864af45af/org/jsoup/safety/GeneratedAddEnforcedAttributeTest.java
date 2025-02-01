package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "target", "_blank");
        assertTrue(safelist.getEnforcedAttributes("a").hasKey("target"));
    }

}