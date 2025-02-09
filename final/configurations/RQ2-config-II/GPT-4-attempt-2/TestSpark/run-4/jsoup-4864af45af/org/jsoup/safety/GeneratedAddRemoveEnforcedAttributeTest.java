package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveEnforcedAttributeTest {

    @Test
    public void addRemoveEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        Attributes attrs = safelist.getEnforcedAttributes("tag1");
        assertTrue(attrs.hasKey("attr1"));
        safelist.removeEnforcedAttribute("tag1", "attr1");
        attrs = safelist.getEnforcedAttributes("tag1");
        assertFalse(attrs.hasKey("attr1"));
    }

}