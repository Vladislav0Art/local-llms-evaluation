package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveEnforcedAttributeTest {

    @Test
    public void addRemoveEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey("class"));

        safelist.addEnforcedAttribute("p", "class", "test");
        attributes = safelist.getEnforcedAttributes("p");
        assertTrue(attributes.hasKey("class"));

        safelist.removeEnforcedAttribute("p", "class");
        attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey("class"));
    }

}