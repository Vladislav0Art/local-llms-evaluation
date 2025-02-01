package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "a");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Element element = new Element("a").attr("rel", "nofollow");
        Element element1 = new Element("a").attr("rel", "follow");
        Attribute attribute = new Attribute("rel", "nofollow");
        Attribute attribute1 = new Attribute("rel", "follow");
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element1, attribute1));
    }

}