package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        safelist.addEnforcedAttribute("a", "enforced", "value");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("enforced", "value"), new Attribute("enforced", "value")));
    }

}