package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Element element = new Element("a");
        Attribute attribute = new Attribute("rel", "nofollow");
        element.attributes().put(attribute);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}