package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("a"));
        safelist.addTags("a");
        assertTrue(safelist.isSafeTag("a"));
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        a.attr("rel", "nofollow");
        assertFalse(safelist.isSafeAttribute("a", a, a.attributes().get("href")));
        assertFalse(safelist.isSafeAttribute("a", a, a.attributes().get("rel")));
        safelist.addAttributes("a", "href");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        assertTrue(safelist.isSafeAttribute("a", a, a.attributes().get("href")));
        assertTrue(safelist.isSafeAttribute("a", a, a.attributes().get("rel")));
    }

}