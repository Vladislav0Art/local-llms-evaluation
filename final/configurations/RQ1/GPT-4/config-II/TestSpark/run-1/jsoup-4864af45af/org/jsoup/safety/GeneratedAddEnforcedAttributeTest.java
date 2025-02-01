package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        Element element = new Element("a");
        Attribute attribute = new Attribute("rel", "nofollow");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}