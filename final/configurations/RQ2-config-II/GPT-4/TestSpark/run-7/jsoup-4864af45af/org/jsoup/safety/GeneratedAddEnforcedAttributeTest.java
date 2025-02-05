package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        String tagName = "tag";
        String attribute = "attribute";
        String value = "value";
        Safelist safelist = new Safelist().addEnforcedAttribute(tagName, attribute, value);
        Attributes enforcedAttributes = safelist.getEnforcedAttributes(tagName);
        assertEquals(value, enforcedAttributes.get(attribute).toString());
    }

}