package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        safelist.addAttributes("a", "example");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("example", "example.com")));
    }

}