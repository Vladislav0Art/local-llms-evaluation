package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String attribute = "lang";
        String value = "en";
        safelist.addEnforcedAttribute("p", attribute, value);
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertTrue(attributes.hasKey(attribute));
        assertEquals(value, attributes.get(attribute));
    }

}