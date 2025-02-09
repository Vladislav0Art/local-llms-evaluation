package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().addEnforcedAttribute("a", "target", "_blank");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.hasKey("target"));
    }

}