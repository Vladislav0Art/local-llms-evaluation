package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        safelist.removeEnforcedAttribute("tag1", "attr1");
        Attributes attributes = safelist.getEnforcedAttributes("tag1");
        assertFalse(attributes.hasKey("attr1"));
    }

}