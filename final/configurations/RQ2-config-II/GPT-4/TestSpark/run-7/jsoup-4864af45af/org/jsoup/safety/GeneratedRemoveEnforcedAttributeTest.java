package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        String tagName = "tag";
        String attribute = "attribute";
        String value = "value";
        Safelist safelist = new Safelist().addEnforcedAttribute(tagName, attribute, value);
        safelist.removeEnforcedAttribute(tagName, attribute);
        Attributes enforcedAttributes = safelist.getEnforcedAttributes(tagName);
        assertFalse(enforcedAttributes.hasKey(attribute));
    }

}