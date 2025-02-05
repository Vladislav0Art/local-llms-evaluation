package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        String tagName = "tag";
        String attribute = "attribute";
        Safelist safelist = new Safelist().addAttributes(tagName, attribute);
        Element dummyElement = new Element(tagName); // This is just a dummy empty element with formatted as "<tag></tag>"
        Attribute dummyAttribute = new Attribute(attribute, "value");
        assertTrue(safelist.isSafeAttribute(tagName, dummyElement, dummyAttribute));
    }

}