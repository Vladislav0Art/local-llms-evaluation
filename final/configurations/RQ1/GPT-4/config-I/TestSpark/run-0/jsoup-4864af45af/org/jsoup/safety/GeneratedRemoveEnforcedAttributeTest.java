package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeEnforcedAttribute("a", "rel");
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        a.attr("rel", "nofollow");
        assertTrue(safelist.isSafeAttribute("a", a, a.attributes().get("href")));
        assertFalse(safelist.isSafeAttribute("a", a, a.attributes().get("rel")));
    }

}