package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String attribute = "lang";
        String value = "en";
        safelist.addEnforcedAttribute("p", attribute, value);
        safelist.removeEnforcedAttribute("p", attribute);
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey(attribute));
    }

}