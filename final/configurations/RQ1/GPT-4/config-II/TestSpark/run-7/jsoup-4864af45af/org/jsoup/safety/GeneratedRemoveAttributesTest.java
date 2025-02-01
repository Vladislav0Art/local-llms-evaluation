package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", element, href));
    }

}