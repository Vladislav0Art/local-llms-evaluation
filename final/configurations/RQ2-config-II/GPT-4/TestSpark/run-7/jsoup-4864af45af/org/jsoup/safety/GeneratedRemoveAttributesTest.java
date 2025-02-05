package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        String tagName = "tag";
        String attribute = "attribute";
        Safelist safelist = new Safelist().addAttributes(tagName, attribute);
        safelist.removeAttributes(tagName, attribute);
        Element dummyElement = new Element(tagName);
        Attribute dummyAttribute = new Attribute(attribute, "value");
        assertFalse(safelist.isSafeAttribute(tagName, dummyElement, dummyAttribute));
    }

}